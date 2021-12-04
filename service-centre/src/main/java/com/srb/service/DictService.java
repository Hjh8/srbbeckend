package com.srb.service;

import com.srb.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author codekiang
 * @since 2021-11-22
 */
public interface DictService extends IService<Dict> {

    void importData(InputStream inputStream);

    List listDictData();
}
