package com.srb.service.impl;

import com.srb.entity.UserAccount;
import com.srb.dao.UserAccountMapper;
import com.srb.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author codekiang
 * @since 2021-11-22
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
