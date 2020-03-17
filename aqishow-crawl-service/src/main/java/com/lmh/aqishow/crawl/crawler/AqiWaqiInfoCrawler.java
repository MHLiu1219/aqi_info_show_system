package com.lmh.aqishow.crawl.crawler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lmh.aqishow.bean.AqiWaqiInfo;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.Date;

/**
 * AqiWaqiInfoCrawler
 *
 * @Author: lmh
 * @CreateTime: 2020-03-13
 * @Description:
 */

public class AqiWaqiInfoCrawler implements PageProcessor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(1).setSleepTime(1000);

    @Override
    public void process(Page page) {
        String jsonStr = page.getJson().toString();
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        JSONObject data4AqiWaqiInfo = getData4AqiWaqiInfo(jsonObject);
        if (data4AqiWaqiInfo == null) {
            return;
        }

        // 数据没有问题,解析数据
        AqiWaqiInfo aqiWaqiInfo = new AqiWaqiInfo();
        aqiWaqiInfo.setStationIdx(data4AqiWaqiInfo.getString("idx"));
        aqiWaqiInfo.setAqi(data4AqiWaqiInfo.getBigDecimal("aqi"));
        aqiWaqiInfo.setAqiUpdateTime(data4AqiWaqiInfo.getJSONObject("time").getDate("s"));
        aqiWaqiInfo.setDominentpol(data4AqiWaqiInfo.getString("dominentpol"));
        JSONObject iaqiJsonObject = data4AqiWaqiInfo.getJSONObject("iaqi");
        try {
            for (String key : iaqiJsonObject.keySet()) {
                iaqiJsonObject.replace(key, iaqiJsonObject.getJSONObject(key).getBigDecimal("v"));
            }
            BeanUtils.copyProperties(aqiWaqiInfo,iaqiJsonObject);
        } catch (Exception e) {
            logger.error("解析iaqi数据过程发生错误");
            e.printStackTrace();
        }

        // 保存数据
        page.putField("aqiWaqiInfo",aqiWaqiInfo);
    }

    @Override
    public Site getSite() {
        return site;
    }

    private JSONObject getData4AqiWaqiInfo(JSONObject jsonObject){
        if (StringUtils.equals(jsonObject.getString("status"),"error")) {
            logger.error("没有获取到正确的数据，原因：" + jsonObject.toJSONString());
            return null;
        } else if (StringUtils.equals(jsonObject.getString("status"),"ok")) {
            logger.info("成功获取到数据");
            // 开始解析数据
            JSONObject data = jsonObject.getJSONObject("data");

            if (data == null) {
                logger.info("好像其实是没有数据的：data==null");
            }

            if (StringUtils.equals(data.getString("aqi"),"-")) {
                // 校验aqi的值
                logger.info("该数据已失效：{\"aqi\":\"-\"}");
                return null;
            }

            Date lastUpdateTime = data.getJSONObject("time").getDate("s");
            if (new Date().getTime() - lastUpdateTime.getTime() > 24*60*60*1000){
                // 校验最后更新时间
                logger.error("该数据可能是无效的，看最后更新时间：" + lastUpdateTime);
                return null;
            }

            return data;
        }
        logger.error("不明原因，反正就是数据不符合预期");
        return null ;
    }
}