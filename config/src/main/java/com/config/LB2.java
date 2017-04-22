package com.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/4/9.
 */
@RestController
public class LB2 {
    @RequestMapping("/greeting")
    public String greeting() {
        return "hello";
    }

    @RequestMapping("/books/a")
    public String testingZuul() {
        return "testingZuul back";
    }

    @RequestMapping("/books")
    public String testingZuul2() {
        return "testingZuul books.....";
    }
}
