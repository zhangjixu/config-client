package com.cn.config.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhangjixu
 * @CreateDate: 2020/11/26 4:25 下午
 * @Description:
 * @Version: 1.0.0
 */
@Configuration
@Data
public class GitConfig {

    @Value("${data.username}")
    private String userName;
    @Value("${data.password}")
    private String password;
    @Value("${data.url}")
    private String url;

}
