package com.example.restribbonserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from RestRibbonServer!";
    }
}
