package com.cn.config.client.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Author: zhangjixu
 * @CreateDate: 2019/1/21
 * @Description:
 * @Version: 1.0.0
 */
@Configuration
public class DruidConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    // 因为 spring 容器的对象是单例模式，创建后不会重新创建，所以要在需要重新注入的 bean 上加上刷新作用域的注解。
    @RefreshScope // 不需要重启服务就可以获得最新配置信息
    public DataSourceProperties primaryDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "dataSource")
    @RefreshScope // 不需要重启服务就可以获得最新配置信息
    public DataSource dataSource() {
        return primaryDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }


}
