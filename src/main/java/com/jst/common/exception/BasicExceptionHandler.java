package com.jst.common.exception;

import com.jst.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理类，自定义异常类JstException，具体异常信息使用枚举方式展示ExceptionEnums，异常结果使用ExceptionResult封装返回
 */
@ControllerAdvice
public class BasicExceptionHandler {
    @ExceptionHandler(JstException.class)
    public ResponseEntity<ExceptionResult> handlerExcption(JstException e){
        return ResponseEntity.status(e.getExceptionEnums().code()).body(new ExceptionResult(e.getExceptionEnums()));
    }
}
