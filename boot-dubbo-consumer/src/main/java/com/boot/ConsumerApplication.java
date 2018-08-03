package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
/**
 * <p>Tiltle: boot-dubbo </p>
 * <p>Description: 消费层 </p>
 *
 * @Author 陈德元
 * data: 2018-08-03
 * version: 1.0
 */
@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
@Configuration
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
