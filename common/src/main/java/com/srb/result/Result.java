package com.srb.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 统一返回结果
 */
@Data
@ApiModel(value = "统一返回结果")
public class Result<T> {

    public static final Integer  SUCCESS = 200;
    public static final Integer  ERROR   = 501;

    @ApiModelProperty(value = "结果: true=操作成功, false=操作失败", allowableValues = "true,false", required = true)
    private             boolean success;
    @ApiModelProperty(value = "状态码")
    private             Integer  code;
    @ApiModelProperty(value = "提示信息")
    private             String  message;
    @ApiModelProperty(value = "操作结果：附带的数据")
    private             T       data;

    public Result(){}

    public Result(final boolean success, final Integer code, final String message, final T data) {
        this.setSuccess(success);
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    public Result ok(final String message, final T data) {
        this.setSuccess(true);
        this.setCode(SUCCESS);
        this.setMessage(message);
        this.setData(data);
        return this;
    }

    public Result ok(final Integer code, final String message, final T data) {
        this.setSuccess(true);
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
        return this;
    }

    public Result error(final String message, final T data) {
        this.setSuccess(false);
        this.setCode(ERROR);
        this.setMessage(message);
        this.setData(data);
        return this;
    }

    public Result error(final Integer code, final String message, final T data) {
        this.setSuccess(false);
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
        return this;
    }
}

