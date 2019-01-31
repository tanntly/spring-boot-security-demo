package cn.tanntly.spring.security.demo.controller;

import org.springframework.web.bind.annotation.*;


import org.springframework.stereotype.Controller;
@Controller
public class LoginController {

    // Login form
    @GetMapping("/login")
    public String login() {
        return "login.html";
    }


    @RequestMapping("/index")
    @ResponseBody
    public String loginError() {
        return "<!DOCTYPE html>index=-==================";
    }




}