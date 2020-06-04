package com.hanergy.out.dao;

import com.hanergy.out.entity.Food;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hanergy.out.vo.FoodVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 商品信息表 Mapper 接口
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Mapper
public interface FoodMapper extends BaseMapper<Food> {

    public List<FoodVo> findByShopId(@Param("menuId") Integer menuId);

    public List<FoodVo> findTop20Sell();
}
