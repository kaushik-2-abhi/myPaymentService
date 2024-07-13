package com.myPaymentService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class WelcomePage {

    @ResponseBody
    @GetMapping("/hi")
    public String welcome(){
        return "Application Deployed";
    }
}
