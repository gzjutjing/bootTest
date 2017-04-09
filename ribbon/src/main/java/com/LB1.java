package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2017/4/9.
 */
@Controller
public class LB1 {
    @RequestMapping("/greeting")
    public String greeting(){
        return "你好";
    }
}
