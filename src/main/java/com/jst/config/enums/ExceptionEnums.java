package com.jst.config.enums;

/**
 * 异常信息枚举
 */
public enum ExceptionEnums {
    ERROR(500,"服务器内部错误"),
    NOT_FOUND(404,"找不到资源啦"),


    ;


    int code;
    String message;

    public int code(){
        return this.code;
    }

    public String message(){
        return this.message;
    }

    ExceptionEnums(int code,String message){
        this.code = code;
        this.message = message;
    }

}
