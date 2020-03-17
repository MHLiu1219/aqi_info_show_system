package com.lmh.aqishow.crawl;

import com.lmh.aqishow.bean.AqiWaqiStation;
import com.lmh.aqishow.crawl.crawler.AqiWaqiInfoCrawler;
import com.lmh.aqishow.crawl.crawler.AqiWaqiStationCrawler;
import com.lmh.aqishow.crawl.mapper.AqiWaqiStationMapper;
import com.lmh.aqishow.crawl.pipeline.AqiWaqiInfoPipeline;
import com.lmh.aqishow.crawl.pipeline.AqiWaqiStationPipeline;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Spider;

import java.util.List;

@SpringBootTest
class AqishowCrawlServiceApplicationTests {

    @Autowired
    AqiWaqiStationMapper aqiWaqiStationMapper;

    @Test
    void contextLoads() {
        List<AqiWaqiStation> aqiWaqiStations = aqiWaqiStationMapper.selectAll();
        System.out.println(aqiWaqiStations);
    }
    @Autowired
    AqiWaqiInfoPipeline aqiWaqiInfoPipeline;
    @Test
    void testAqiWaqiInfoCrawler(){
        Spider.create(new AqiWaqiInfoCrawler())
                .addUrl("https://api.waqi.info/feed/@9847/?token=c72897dbf30d8b437e478eccea27de192bea9931")
                .addPipeline(aqiWaqiInfoPipeline)
                .thread(2)
                .run();
    }

    @Autowired
    AqiWaqiStationPipeline aqiWaqiStationPipeline;

    @Test
    void testAqiWaqiStationCrawler(){

        Request request = new Request();
        request.setUrl("https://api.waqi.info/nsearch/full/广州?n=50");

        Spider.create(new AqiWaqiStationCrawler())
                .addRequest(request)
                .addPipeline(aqiWaqiStationPipeline)
                .thread(2)
                .run();
    }
}
