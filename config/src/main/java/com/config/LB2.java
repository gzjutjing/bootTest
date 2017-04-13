package com.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/4/9.
 */
@Controller
public class LB2 {
    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return "hello";
    }
}
