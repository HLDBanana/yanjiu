package com.hanergy.out.dao;

import com.hanergy.out.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单主表 Mapper 接口
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
