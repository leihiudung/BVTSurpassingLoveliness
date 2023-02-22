package com.example.bvtsurpassingloveliness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping(path = "")
    public String accessWebsite() {

        return "page/index.html";
    }

    @RequestMapping(path = "/walkportfolio")
    public String accessWebsiteWalkportfolio() {

        return "page/portfolio.html";
    }
}
