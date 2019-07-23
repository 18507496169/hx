package com.hx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangch on 2019/7/23 09:58
 * description:
 *
 * @since JDK 1.6
 */
@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("")
    public String hello() {
        return "/page/index.html";
    }
}
