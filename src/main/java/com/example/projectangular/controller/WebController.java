package com.example.projectangular.controller;

import com.example.projectangular.entity.HelloWordBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/public")
public class WebController {

    @GetMapping("sayHello")
    public String sayHello(){
        return "Hello Angular";
    }

    @GetMapping("getMess")
    public HelloWordBean getMesssage(){
        return new HelloWordBean("Call API with Angular");
    }
    @GetMapping("getMess/{name}")
    public HelloWordBean getMesssage(@PathVariable String name){
        return new HelloWordBean("Hi ,Let's Name :  "+name);
    }


}
