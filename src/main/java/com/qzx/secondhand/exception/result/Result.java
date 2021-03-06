package com.qzx.secondhand.exception.result;

import com.qzx.secondhand.exception.statusCode.GlobalCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 定义controller统一返回值结构信息
 */
@ApiModel(value = "统一返回值结构信息")
@Data
public class Result {

    // 响应业务状态 200 成功 500 失败 401 未授权
    @ApiModelProperty(value = "状态码")
    private Integer status;

    // 响应消息
    @ApiModelProperty(value = "响应消息")
    private String msg;

    // 响应中的数据
    @ApiModelProperty(value = "响应中的数据")
    private Object data;


    private Result(Object data) {
        this.status = 200;
        this.msg = "SUCCESS";
        this.data = data;
    }

    private Result(String msg) {
        this.status = 200;
        this.msg = msg;
        this.data = null;
    }

    private Result(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
        this.data = null;
    }

    private Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static Result success() {
        return new Result("success");
    }

    public static Result success(String msg) {
        return new Result(msg);
    }

    public static Result success(Object data) {
        return new Result(data);
    }

    public static Result error(GlobalCodeEnum globalCodeEnum) {
        return Result.error(globalCodeEnum,null);
    }

    public static Result error(GlobalCodeEnum globalCodeEnum,Object data) {
        return new Result(globalCodeEnum.getCode(),globalCodeEnum.getMsg(),data);
    }
}