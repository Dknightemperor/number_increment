package com.numberIncremnt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/check")
public class CheckController {

    @RequestMapping("/this")
    public String checkThisPage(HttpServletRequest request, HttpServletResponse response) {
        return "homePage";
    }
}
