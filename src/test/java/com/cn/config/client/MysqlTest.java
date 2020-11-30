package com.cn.config.client;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zhangjixu
 * @CreateDate: 2020/11/23 6:49 下午
 * @Description:
 * @Version: 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MysqlTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test() {
        String sql = "select * from test";
        System.out.println(jdbcTemplate.queryForList(sql));
    }


}
