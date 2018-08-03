package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * <p>Tiltle: boot-dubbo </p>
 * <p>Description: 提空层 </p>
 *
 * @Author 陈德元
 * data: 2018-08-03
 * version: 1.0
 */
@SpringBootApplication
@EnableTransactionManagement
@ImportResource({"classpath:config/spring-dubbo.xml"})
@MapperScan(basePackages = {"com.boot.mapper"})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
