package com.jst.common.vo;

import com.jst.common.enums.ExceptionEnums;

/**
 * 异常结果封装类
 */
public class ExceptionResult {
    private int code;
    private String message;
    private long timestamp;

    public ExceptionResult(ExceptionEnums e) {
        this.code = e.code();
        this.message = e.message();
        this.timestamp = System.currentTimeMillis();
    }
}
