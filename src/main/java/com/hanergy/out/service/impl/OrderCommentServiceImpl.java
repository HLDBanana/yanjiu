package com.hanergy.out.service.impl;

import com.hanergy.out.entity.OrderComment;
import com.hanergy.out.dao.OrderCommentMapper;
import com.hanergy.out.service.IOrderCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单--评论 服务实现类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Service
public class OrderCommentServiceImpl extends ServiceImpl<OrderCommentMapper, OrderComment> implements IOrderCommentService {

}
