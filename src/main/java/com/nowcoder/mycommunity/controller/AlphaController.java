package com.nowcoder.mycommunity.controller;

import com.nowcoder.mycommunity.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "hello Spring Boot.";
    }

    @Autowired
    private AlphaService alphaService;
    public String find() {return alphaService.find();}
}
