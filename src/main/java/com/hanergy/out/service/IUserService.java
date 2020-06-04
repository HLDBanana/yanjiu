package com.hanergy.out.service;

import com.hanergy.out.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户登录表 服务类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
public interface IUserService extends IService<User> {

    /**
     * 通过微信openid获取用户信息
     * @param openId
     * @return
     */
    public User findByOpenId(String openId);
}
