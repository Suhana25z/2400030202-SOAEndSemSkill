package com.example.ms1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    // GET /ms1/add?a=5&b=10  ->  "MS 1.1 - Addition = 15"
    @GetMapping(value = "/ms1/add", produces = "text/plain;charset=UTF-8")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "MS 1.1 - Addition = " + (a + b);
    }
}
