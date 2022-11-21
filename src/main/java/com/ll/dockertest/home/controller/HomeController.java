package com.ll.dockertest.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String showMain() {
        return "<h1>Dockerfile, docker-compose.yml</h1> <h2>도커 이미지 덮어쓰기/h2>";
    }
}
