package com.lmh.aqishow.crawl.pipeline;

import com.lmh.aqishow.bean.AqiWaqiStation;
import com.lmh.aqishow.crawl.mapper.AqiWaqiStationMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.Date;
import java.util.List;

/**
 * AqiWaqiStationPipeline
 *
 * @Author: lmh
 * @CreateTime: 2020-03-15
 * @Description:
 */
@Component
public class AqiWaqiStationPipeline implements Pipeline {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AqiWaqiStationMapper aqiWaqiStationMapper;

    @Override
    public void process(ResultItems resultItems, Task task) {
        List<AqiWaqiStation> aqiWaqiStations = resultItems.get("aqiWaqiStations");
        if (aqiWaqiStations != null && aqiWaqiStations.size() > 0) {
            for (AqiWaqiStation aqiWaqiStation : aqiWaqiStations) {
                List<AqiWaqiStation> select = aqiWaqiStationMapper.select(aqiWaqiStation);
                if (select == null) {
                    aqiWaqiStation.setLmhCreate(new Date());
                    aqiWaqiStationMapper.insertSelective(aqiWaqiStation);
                    logger.info("成功存入数据：" + aqiWaqiStation.toString());
                } else {
                    logger.warn("数据已存在：" + select);
                }
            }
        }
    }
}