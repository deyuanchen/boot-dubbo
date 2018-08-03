package com.boot.base;

/**
 * <p>Tiltle: hwplat </p>
 * <p>Description: TODO(这里来描述信息) </p>
 * Author 陈德元
 * data: 2018-01-21
 * version: 1.0
 */
public enum BaseConstants {

    FAILED(0, "请求失败"),//failed
    SUCCESS(1, "success");


    public int status;

    public String msg;

    BaseConstants(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}