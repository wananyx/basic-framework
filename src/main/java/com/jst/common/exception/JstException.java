package com.jst.common.exception;

import com.jst.common.enums.ExceptionEnums;
import lombok.Getter;

/**
 * 自定义异常类
 */
@Getter
public class JstException extends RuntimeException{
    ExceptionEnums exceptionEnums;
    public JstException(ExceptionEnums e){
        this.exceptionEnums = e;
    }
}
