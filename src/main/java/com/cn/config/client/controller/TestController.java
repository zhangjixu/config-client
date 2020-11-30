package com.cn.config.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangjixu
 * @CreateDate: 2020/11/27 10:50 上午
 * @Description:
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("/mysql")
@Slf4j
public class TestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("/test")
    public Object test() {
        String sql = "select * from test";
        return jdbcTemplate.queryForList(sql);
    }


}
