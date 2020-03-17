package com.lmh.aqishow.crawl.crawler;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lmh.aqishow.bean.AqiWaqiStation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * AqiWaqiStationCrawler
 *
 * @Author: lmh
 * @CreateTime: 2020-03-15
 * @Description:
 */
public class AqiWaqiStationCrawler implements PageProcessor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(1).setSleepTime(1000);


    @Override
    public void process(Page page) {

        String jsonStr = page.getJson().toString();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);

        // 解析请求链接：https://api.waqi.info/nsearch/full/关键字?n=50
        if (StringUtils.contains(page.getUrl().toString(),"https://api.waqi.info/nsearch/full/")) {
            JSONArray result4AqiWaqiStations = getResult4AqiWaqiInfo(jsonObject);
            String urlStr = "https://api.waqi.info/search/?token=c72897dbf30d8b437e478eccea27de192bea9931&keyword=";
            // 无数据
            if (result4AqiWaqiStations == null) {
                String url = page.getUrl().toString();
                int beginIndex = url.indexOf("full/") + 5;
                int endIndex = url.indexOf("?");
                if (endIndex > beginIndex) {
                    String term = url.substring(beginIndex, endIndex);
                } else {
                    logger.warn("输入了一个空的关键字？？？？？？？" + url);
                }
                return;
            }

            // 有数据
            String term = jsonObject.getString("term");
            if (StringUtils.isNotBlank(term)) {
                page.addTargetRequest(urlStr + term);
            } else {
                logger.warn("输入了一个空的关键字？？？？？？？{" + term + "}");
            }
            for (Object o : result4AqiWaqiStations) {
                JSONObject result4AqiWaqiStation = (JSONObject) o;
                JSONArray jsonArray = result4AqiWaqiStation.getJSONArray("n");
                if (jsonArray != null && jsonArray.size() > 0) {
                    String stationName = jsonArray.getString(0);
                    page.addTargetRequest(urlStr + stationName);
                }
            }

            return;
        }


        // 解析请求链接https://api.waqi.info/search/?token=c72897dbf30d8b437e478eccea27de192bea9931&keyword=关键字
        JSONArray data4AqiWaqiStations = getData4AqiWaqiInfo(jsonObject);
        if (data4AqiWaqiStations == null) {
            return;
        }

        // 数据没有问题
        List<AqiWaqiStation> aqiWaqiStations = new ArrayList<>();
        for (Object o : data4AqiWaqiStations) {
            JSONObject data4AqiWaqiStation = (JSONObject) o;
            AqiWaqiStation aqiWaqiStation = new AqiWaqiStation();
            aqiWaqiStation.setStationIdx(data4AqiWaqiStation.getString("uid"));
            JSONObject station = data4AqiWaqiStation.getJSONObject("station");
            if (station != null) {
                aqiWaqiStation.setStationName(station.getString("name"));
                JSONArray geo = station.getJSONArray("geo");
                if (geo != null && geo.size() == 2) {
                    aqiWaqiStation.setLatitude(geo.getBigDecimal(0));
                    aqiWaqiStation.setLongitude(geo.getBigDecimal(1));
                }
                String url = station.getString("url");
                aqiWaqiStation.setUrl(url);
                aqiWaqiStation.setUrlWqiDetails("https://aqicn.org/city/" + url);
                aqiWaqiStation.setCountry(station.getString("country"));
                int first = url.indexOf('/');// 第一个斜杠的位置
                if (first > 0) {
                    int second = url.indexOf('/', first + 1);// 第二个斜杠的位置
                    aqiWaqiStation.setProvince(url.substring(0, first));
                    if (second > 0) {
                        aqiWaqiStation.setCity(url.substring(first + 1, second));
                    }
                }
            }
            JSONObject time = data4AqiWaqiStation.getJSONObject("time");
            if (time != null) {
                aqiWaqiStation.setTimeZone(time.getString("tz"));
                aqiWaqiStation.setLastUpdateTime(time.getDate("stime"));
            }

            if (aqiWaqiStation.getStationIdx() != null && aqiWaqiStation.getStationIdx().length() > 0) {
                aqiWaqiStations.add(aqiWaqiStation);
            }
        }

        page.putField("aqiWaqiStations", aqiWaqiStations);
    }

    /**
     * 对解析请求链接："https://api.waqi.info/nsearch/full/关键字?n=50"的返回结果进行一定的校验
     * @param jsonObject
     * @return
     */
    private JSONArray getResult4AqiWaqiInfo(JSONObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }
        JSONArray results = jsonObject.getJSONArray("results");
        if (results == null || results.size() <= 0) {
            return null;
        }
        return results;
    }

    /**
     * 对解析请求链接："https://api.waqi.info/search/?token=c72897dbf30d8b437e478eccea27de192bea9931&keyword=关键字"的返回结果进行一定的校验
     * @param jsonObject
     * @return
     */
    private JSONArray getData4AqiWaqiInfo(JSONObject jsonObject) {
        if (StringUtils.equals(jsonObject.getString("status"), "error")) {
            logger.error("没有获取到正确的数据，原因：" + jsonObject.toJSONString());
            return null;
        } else if (StringUtils.equals(jsonObject.getString("status"), "ok")) {
            logger.info("成功获取到监测站数据");
            // 开始解析数据
            JSONArray data = jsonObject.getJSONArray("data");

            if (data == null || data.size() <= 0) {
                logger.error("好像其实是没有数据的：data==null");
                return null;
            }

            return data;
        }
        logger.error("不明原因，反正就是数据不符合预期");
        return null;
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new AqiWaqiStationCrawler())
                .addUrl("https://api.waqi.info/nsearch/full/广州?n=50")
                .run();
    }
}