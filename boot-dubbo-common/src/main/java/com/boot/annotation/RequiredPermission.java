package com.boot.annotation;

import java.lang.annotation.*;

/**
 * <p>Tiltle: springboot-dubbo </p>
 * <p>Description: 验证权限 </p>
 *
 * @Author 陈德元
 * data: 2018-08-03
 * version: 1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface RequiredPermission {
}
