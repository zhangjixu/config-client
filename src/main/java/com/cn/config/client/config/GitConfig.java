package com.cn.config.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhangjixu
 * @CreateDate: 2020/11/26 4:25 下午
 * @Description:
 * @Version: 1.0.0
 */
@Configuration
@Data
@RefreshScope
public class GitConfig {

    @Value("${spring.datasource.username}")
    private String userName;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private String url;

}
