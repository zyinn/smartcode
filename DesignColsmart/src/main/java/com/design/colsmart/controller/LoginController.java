package com.design.colsmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: yinan.zhang
 * @Description:
 * @Date: Created on 2018/3/10.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String test() {
        return "index";
    }
}
