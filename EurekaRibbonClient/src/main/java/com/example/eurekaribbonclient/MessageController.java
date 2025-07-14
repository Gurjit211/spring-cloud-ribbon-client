package com.example.eurekaribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/client-message")
    public String getMessage() {
        // Call the REST-RIBBON-SERVER service via Ribbon using its Eureka service ID
        String serverResponse = restTemplate.getForObject("http://REST-RIBBON-SERVER/api/message", String.class);
        return "Hello from RibbonClientServer! Response from Server: " + serverResponse;
    }
}
