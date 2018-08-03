package com.boot.base;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * <p>Tiltle: hwplatdemo </p>
 * <p>Description: 统一返回结果类 </p>
 * Author 陈德元
 * data: 2018-01-17
 * version: 1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResult {

    // 状态码：1成功，其他为失败
    public int status;

    // 成功为success，其他为失败原因
    public String message;

    // 数据结果集
    public Object data;
    @JsonIgnore
    public String url;
    
    public Long timestamp ;// 时间戳

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BaseResult(BaseConstants baseConstant) {
        this.status = baseConstant.getStatus();
        this.message = baseConstant.getMsg();
    }

    public BaseResult(BaseConstants baseConstant, Object data) {
        this.status = baseConstant.getStatus();
        this.message = baseConstant.getMsg();
        this.data = data;
    }
    
    public BaseResult(BaseConstants baseConstant, Object data , Long timestamp) {
        this.status = baseConstant.getStatus();
        this.message = baseConstant.getMsg();
        this.data = data;
        this.timestamp = timestamp ;
    }
    
    /**
     * 默认返回成功
     * Title:BaseResult.java
     * Description: 构造函数
     */
    public BaseResult(Object data) {
    	if(data != null){
    		this.data = data;
    	}
        this.status = BaseConstants.SUCCESS.getStatus() ;
        this.message = BaseConstants.SUCCESS.getMsg();
    }


    /**
     * 默认返回成功
     * Title:BaseResult.java
     * Description: 构造函数
     */
    public BaseResult() {
    	this.status = BaseConstants.SUCCESS.getStatus() ;
        this.message = BaseConstants.SUCCESS.getMsg();
    }

    /**
     * 返回错误以及错误信息
     * Title:BaseResult.java
     * Description: 构造函数
     * @param status
     * @param message
     */
    public BaseResult(int status , String message){
    	this.status = status ;
    	this.message = message ;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

}
