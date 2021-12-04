package com.srb.service.impl;

import com.alibaba.excel.EasyExcel;
import com.srb.entity.Dict;
import com.srb.dao.DictMapper;
import com.srb.listener.ExcelDictDTOListener;
import com.srb.service.DictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 数据字典 服务实现类
 * </p>
 *
 * @author codekiang
 * @since 2021-11-22
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public void importData(InputStream inputStream) {
        EasyExcel.read(inputStream, Dict.class, new ExcelDictDTOListener(baseMapper)).sheet().doRead();
    }

    @Override
    public List listDictData() {
        return null;
    }
}
