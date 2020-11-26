package com.cn.config.client.controller;

import com.cn.config.client.config.GitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangjixu
 * @CreateDate: 2020/11/23 6:50 下午
 * @Description:
 * @Version: 1.0.0
 */
@RestController
public class GitController {

    @Autowired
    private GitConfig gitConfig;

    @RequestMapping("/get")
    public Object test() {
        String result = gitConfig.getUserName() + " " + gitConfig.getPassword() + " " + gitConfig.getUrl();
        return result;
    }


}
