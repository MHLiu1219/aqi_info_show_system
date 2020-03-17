package com.lmh.aqishow.crawl.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lmh.aqishow.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController
 *
 * @Author: lmh
 * @CreateTime: 2020-03-17
 * @Description:
 */
@RestController
public class DemoController {

    @Reference
    DemoService demoService;

    @RequestMapping("test")
    public String test(){
        String test = demoService.test();
        return test;
    }
}