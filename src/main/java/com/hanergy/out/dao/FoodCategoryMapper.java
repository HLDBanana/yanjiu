package com.hanergy.out.dao;

import com.hanergy.out.entity.FoodCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商家的商品分类 Mapper 接口
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Mapper
public interface FoodCategoryMapper extends BaseMapper<FoodCategory> {

}
