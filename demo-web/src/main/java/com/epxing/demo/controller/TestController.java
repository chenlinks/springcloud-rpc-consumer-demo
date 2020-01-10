package com.epxing.demo.controller;

import com.epxing.demo.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenling
 * @date 2020/1/6 2:04
 * @since V1.0.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/name/{name}")
    public void test( @PathVariable("name") String name){
        testService.testEntity(name);
        System.out.println("测试请求成功！");
    }

}
