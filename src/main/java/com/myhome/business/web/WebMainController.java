package com.myhome.business.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebMainController {

    @RequestMapping(value = "/")
    public String home() {
        System.out.println("test");
        return "index.html";
    }

    @RequestMapping(value = "/test")
    public String home2() {
        System.out.println("test");
        return "index2.html";
    }

}
