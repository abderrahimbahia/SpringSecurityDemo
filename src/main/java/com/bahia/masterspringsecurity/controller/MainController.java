package com.bahia.masterspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping()
public class MainController {

    @GetMapping()
    public String sayHello(Principal principal){
        return "hello, " + principal.getName();
    }
}
