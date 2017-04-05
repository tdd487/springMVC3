package com.tdd.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by TDD on 2017/4/4.
 */
@Controller
public class ControllerTest {

    @RequestMapping("login")
    private @ResponseBody String hello(
            @RequestParam(value = "username", required = false)String username,
            @RequestParam(value = "password", required = false)String password
    ){
        return "Hello "+username+",Your password is: "+password;

    }

}
