package com.controller;

import com.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cheng on 2018/4/5.
 */

@RestController
public class HelloController {

   /* @Value("${cupSize}")
    private String cupSize;*/
    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping("/hello")
    public String say() {
        return girlProperties.getCupSize();
    }
}
