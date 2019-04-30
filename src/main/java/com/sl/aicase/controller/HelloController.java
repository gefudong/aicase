package com.sl.aicase.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gefudong on 2019/4/26.
 */

@Controller
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/hi")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        logger.info("hello world");
        return "hello";
    }
    
}
