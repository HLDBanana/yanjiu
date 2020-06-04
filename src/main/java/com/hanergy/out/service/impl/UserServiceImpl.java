package com.hanergy.out.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hanergy.out.entity.User;
import com.hanergy.out.dao.UserMapper;
import com.hanergy.out.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录表 服务实现类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User findByOpenId(String openId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("openId",openId);

        return this.baseMapper.selectOne(queryWrapper);
    }
}
