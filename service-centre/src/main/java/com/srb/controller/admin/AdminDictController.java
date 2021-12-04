package com.srb.controller.admin;


import com.alibaba.excel.EasyExcel;
import com.srb.entity.Dict;
import com.srb.result.Result;
import com.srb.service.DictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * <p>
 * 数据字典 前端控制器
 * </p>
 *
 * @author codekiang
 * @since 2021-11-22
 */
@Api(tags = "管理员 - 数据字典")
@Slf4j
@RestController
@RequestMapping("admin/core/dict")
public class AdminDictController {

    @Autowired
    private DictService dictService;

    @ApiOperation("Excel数据的批量导入")
    @ApiParam(value = "Excel数据字典文件", required = true)
    @PostMapping("/import")
    public Result batchImport(@RequestParam MultipartFile file){
        try {
            InputStream inputStream = file.getInputStream();
            dictService.importData(inputStream);
            return new Result().ok("数据字典数据批量导入成功", null);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @ApiOperation("Excel数据的导出")
    @GetMapping("/export")
    public void export(HttpServletResponse response) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("mydict", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), Dict.class).sheet("数据字典").doWrite(dictService.listDictData());
    }
}

