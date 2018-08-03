package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.BaseController;

import com.boot.service.TestService;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;
/**
 * <p>Tiltle: boot-dubbo </p>
 * <p>Description: 测试控制层 </p>
 *
 * @Author 陈德元
 * data: 2018-08-03
 * version: 1.0
 */
@RestController
@RequestMapping("/")
public class TestController extends BaseController{
    @Reference(version = "1.0.0")
    private TestService testService;

    @GetMapping("hello")
    public String hello(@NotBlank(message = "token不能为空")
                            @RequestHeader(value = "Authorization") String authorization) throws Exception {
        throw new Exception();
       // return testService.sayHello("Hello springboot and dubbo!");
    }

    @GetMapping("user")
    public User user() {
        User user = testService.findUser();
        return user;
    }
}
