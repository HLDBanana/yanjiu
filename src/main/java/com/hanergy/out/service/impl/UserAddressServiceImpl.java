package com.hanergy.out.service.impl;

import com.hanergy.out.entity.UserAddress;
import com.hanergy.out.dao.UserAddressMapper;
import com.hanergy.out.service.IUserAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户配送地址 服务实现类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements IUserAddressService {

}
