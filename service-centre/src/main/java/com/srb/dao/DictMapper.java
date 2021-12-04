package com.srb.dao;

import com.srb.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author codekiang
 * @since 2021-11-22
 */
public interface DictMapper extends BaseMapper<Dict> {

    void insertBatch(List<Dict> list);
}
