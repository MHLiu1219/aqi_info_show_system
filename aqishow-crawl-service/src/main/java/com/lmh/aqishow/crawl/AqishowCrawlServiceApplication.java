package com.lmh.aqishow.crawl;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = "com.lmh.aqishow.crawl.mapper")
public class AqishowCrawlServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AqishowCrawlServiceApplication.class, args);
    }

}
