package com.example.heroku.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class HerokuController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime() {

        return "Merhaba Dünya : gayvazoglu.29@gmail.com : "+ Instant.now().toString();
    }
}
