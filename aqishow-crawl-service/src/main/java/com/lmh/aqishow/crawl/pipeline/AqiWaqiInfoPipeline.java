package com.lmh.aqishow.crawl.pipeline;

import com.lmh.aqishow.bean.AqiWaqiInfo;
import com.lmh.aqishow.crawl.mapper.AqiWaqiInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.Date;

/**
 * AqiWaqiStationPipeline
 *
 * @Author: lmh
 * @CreateTime: 2020-03-13
 * @Description:
 */
@Component
public class AqiWaqiInfoPipeline implements Pipeline {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AqiWaqiInfoMapper aqiWaqiInfoMapper;

    @Override
    public void process(ResultItems resultItems, Task task) {

        AqiWaqiInfo aqiWaqiInfo = resultItems.get("aqiWaqiInfo");
        if (aqiWaqiInfo != null) {
            aqiWaqiInfo.setLmhCreate(new Date());
            aqiWaqiInfoMapper.insert(aqiWaqiInfo);
        }
    }

}