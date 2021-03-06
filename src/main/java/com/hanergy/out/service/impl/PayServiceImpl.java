package com.hanergy.out.service.impl;

import com.hanergy.out.entity.Pay;
import com.hanergy.out.dao.PayMapper;
import com.hanergy.out.service.IPayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单支付表 服务实现类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Service
public class PayServiceImpl extends ServiceImpl<PayMapper, Pay> implements IPayService {

}
