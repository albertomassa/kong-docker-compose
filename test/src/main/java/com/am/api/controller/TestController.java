package com.am.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "test-controller")
    public ResponseEntity<String> test() {
        return new ResponseEntity("it works!", HttpStatus.OK);
    }

}
