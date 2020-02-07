package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApp {

    public static void main (String[] args){
        SpringApplication.run (DockerApp.class,args);
    }

    @RequestMapping("/")
    public String home(){
        return "Docker Hello World";
    }
}
