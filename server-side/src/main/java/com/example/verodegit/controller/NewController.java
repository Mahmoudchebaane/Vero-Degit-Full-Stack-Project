package com.example.verodegit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;


public class NewController {

    @PostMapping(value = "/statusCheck")
    public String giveStatus200(){
        return HttpStatus.OK;
    }
}