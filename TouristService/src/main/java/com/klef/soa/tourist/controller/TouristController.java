package com.klef.soa.tourist.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TouristController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/tourist")
    public String displayTourist() {

        return "Tourist Service Running on Port: " + port;
    }
}