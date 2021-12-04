package com.srb.exception;

import com.baomidou.mybatisplus.extension.api.R;
import com.srb.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class UnifiedExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public Result handleException(Exception e){
        log.error(e.getMessage(), e);
        return new Result().error(e.getMessage(), e.getMessage());
    }
}
