package com.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.mapper.UserOccupationMapper;
import com.boot.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@Service(version = "1.0.0")
@Transactional
public class TestServiceImpl implements TestService {
    private final static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
    @Autowired
    private UserOccupationMapper userOccupationMapper;
    @Override
    public String sayHello(String str) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date()) + ": " + str;
    }

    @Override
    public User findUser() {
        int i = userOccupationMapper.selctId(new HashMap<>());
        logger.info("----------"+i);
        User user = new User();
        user.setId(1001);
        user.setUsername("scott");
        user.setPassword("tiger");

        return user;
    }
}
