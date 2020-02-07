package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DockerClient {

    public static void main (String[] args){
        SpringApplication.run (DockerClient.class,args);
    }

    @RequestMapping("/")
    public String home(){

        RestTemplate restTemplate = new RestTemplate ();
        String response = restTemplate.getForObject ("http://docker-test-app:8080/",String.class);
        return "Response from remote server : "+response;
    }
}
