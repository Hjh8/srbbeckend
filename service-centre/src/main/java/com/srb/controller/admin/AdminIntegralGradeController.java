package com.srb.controller.admin;


import com.srb.entity.IntegralGrade;
import com.srb.result.Result;
import com.srb.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author codekiang
 * @since 2021-11-22
 */
@Slf4j
@RestController
@RequestMapping("admin/core/integralGrade")
@Api(tags = "管理员-积分管理")
public class AdminIntegralGradeController {

    @Autowired
    private IntegralGradeService service;

    @ApiOperation(value = "获取积分列表", notes = "获取积分列表")
    @GetMapping("/list")
    public Result<List<IntegralGrade>> listAll(){
//        Assert.notNull(null, "数据为空");
        /* return new Result<>(true, 200, "操作成功", service.list()); */
//        log.info("this is info");
//        log.warn("this is warn");
//        log.error("this is error");
        return new Result().ok("获取积分列表成功", service.list());
    }

    @ApiOperation(value = "根据id删除积分列表", notes = "根据id删除积分列表")
    @ApiImplicitParam(name = "id", value = "id", required = true)
    @DeleteMapping("remove/{id}")
    public Result<Boolean> removeById(@PathVariable Integer id){
        boolean b = service.removeById(id);
        return new Result().ok("删除积分成功", b);
    }

    @ApiOperation(value = "添加积分等级", notes = "添加积分等级")
    @PostMapping("save")
    public Result<Boolean> add(@RequestBody IntegralGrade integralGrade){
        boolean b = service.save(integralGrade);
        if(b){
            return new Result().ok("添加积分等级成功", true);
        }
        else {
            return new Result().error("添加积分等级失败", false);
        }
    }

    @ApiOperation(value = "根据id查询积分等级", notes = "根据id查询积分等级")
    @ApiImplicitParam(name = "id", value = "id", required = true)
    @GetMapping("get/{id}")
    public Result<Boolean> query(@PathVariable Integer id){
        IntegralGrade integralGrade = service.getById(id);
        if(integralGrade != null){
            return new Result().ok("根据id查询积分等级成功", integralGrade);
        }
        else {
            return new Result().error("根据id查询积分等级失败", null);
        }
    }

    @ApiOperation(value = "更新积分等级", notes = "更新积分等级")
    @PutMapping("update")
    public Result<Boolean> update(@RequestBody IntegralGrade integralGrade){
        boolean b = service.updateById(integralGrade);
        if(b){
            return new Result().ok("更新积分等级成功", true);
        }
        else {
            return new Result().error("更新积分等级失败", null);
        }
    }

}

