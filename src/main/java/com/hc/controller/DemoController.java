package com.hc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 梁云亮
 * @Date 2020/5/1 22:59
 * @Description:
 */

@CrossOrigin(origins = "http://localhost:63342", maxAge = 3600)
@RestController
public class DemoController {
    @RequestMapping("/fun")
    public String fun(String p){
        System.out.println("param "+p);
        return "{\"name\":\"zhangsan\"}";
    }
}
