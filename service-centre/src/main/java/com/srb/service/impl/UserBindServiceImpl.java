package com.srb.service.impl;

import com.srb.entity.UserBind;
import com.srb.dao.UserBindMapper;
import com.srb.service.UserBindService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户绑定表 服务实现类
 * </p>
 *
 * @author codekiang
 * @since 2021-11-22
 */
@Service
public class UserBindServiceImpl extends ServiceImpl<UserBindMapper, UserBind> implements UserBindService {

}
