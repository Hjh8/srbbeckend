package com.srb.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author codekiang
 * @since 2021-11-22
 */
@Api(tags = "积分管理")
@RestController
@RequestMapping("api/integralGrade")
public class IntegralGradeController {

    @ApiOperation("测试接口")
    @GetMapping("/test")
    public String test(){
        return "dd";
    }
}

