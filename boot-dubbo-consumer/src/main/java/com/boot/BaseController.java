package com.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>Tiltle: boot-dubbo </p>
 * <p>Description: 控制层基类统一异常处理</p>
 *
 * @Author 陈德元
 * data: 2018-08-03
 * version: 1.0
 */
public abstract class BaseController {

	private final static Logger _log = LoggerFactory.getLogger(BaseController.class);

	/**
	 * 统一异常处理
	 * @param request
	 * @param response
	 * @param exception
	 */
	@ExceptionHandler
	public void exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {


	}



}
