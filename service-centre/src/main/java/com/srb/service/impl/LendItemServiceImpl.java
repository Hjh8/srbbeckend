package com.srb.service.impl;

import com.srb.entity.LendItem;
import com.srb.dao.LendItemMapper;
import com.srb.service.LendItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标的出借记录表 服务实现类
 * </p>
 *
 * @author codekiang
 * @since 2021-11-22
 */
@Service
public class LendItemServiceImpl extends ServiceImpl<LendItemMapper, LendItem> implements LendItemService {

}
