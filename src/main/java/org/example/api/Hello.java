package org.example.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @Value("${pf}")
    private String pf;

    @RequestMapping("/world")
    public String helloWorld(){

        return pf;
    }
}
