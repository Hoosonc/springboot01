package com.hxc.springboot01.controller;

import com.hxc.springboot01.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/18
 * Time: 13:25
 */
//@ResponseBody
//@Controller
@Slf4j
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car() {
        return car;
    }

    @RequestMapping("/hello")
    String home() {
        log.info("=========");
        return "Hello World!";
    }
}
