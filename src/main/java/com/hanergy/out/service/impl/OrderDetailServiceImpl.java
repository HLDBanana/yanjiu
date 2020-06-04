package com.hanergy.out.service.impl;

import com.hanergy.out.entity.OrderDetail;
import com.hanergy.out.dao.OrderDetailMapper;
import com.hanergy.out.service.IOrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单详情表 服务实现类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {

}
