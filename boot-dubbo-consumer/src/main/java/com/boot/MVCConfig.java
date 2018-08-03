package com.boot;

import com.boot.interceptor.BootInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p>Tiltle: springboot-dubbo </p>
 * <p>Description: TODO(这里来描述信息) </p>
 *
 * @Author 陈德元
 * data: 2018-08-03
 * version: 1.0
 */
@Configuration
public class MVCConfig extends WebMvcConfigurerAdapter {
    @Bean
    public BootInterceptor securityInterceptor() {
        return new BootInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(securityInterceptor()).excludePathPatterns("/login/*")
                .excludePathPatterns("/error").addPathPatterns("/**");
    }

}
