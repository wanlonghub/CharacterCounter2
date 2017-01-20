package com.qunar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by NULL on 2017/1/20.
 * 测试Spring MVC Controller
 *
 */

@Controller                     // 将这个类注册为Controller
@RequestMapping("/test")        // 拦截相应路径：host/test
public class TestController {

    @RequestMapping("/hello")   // 拦截相应路径：host/test/hello
    public String testMVC(){
        System.out.println("拦截相应路径：host/test/hello");
        return "index";         // 返回ViewTemplate
    }

}
