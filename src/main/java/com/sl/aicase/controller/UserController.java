package com.sl.aicase.controller;

import com.sl.aicase.model.User;
import com.sl.aicase.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gefudong on 2019/4/26.
 */
@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/findUserAll")
    public String findUserAll(Model model) {
        List<User> userList = userService.findUserAll();
        model.addAttribute("userlist",userList);
        logger.info("users:"+ userList);
        return "showUsers";
    }
}
