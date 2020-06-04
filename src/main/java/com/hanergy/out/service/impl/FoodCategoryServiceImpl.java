package com.hanergy.out.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hanergy.out.entity.FoodCategory;
import com.hanergy.out.dao.FoodCategoryMapper;
import com.hanergy.out.service.IFoodCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商家的商品分类 服务实现类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Service
public class FoodCategoryServiceImpl extends ServiceImpl<FoodCategoryMapper, FoodCategory> implements IFoodCategoryService {

    @Override
    public List<FoodCategory> findByShopIdAndStatus(Integer shopId, Integer status) {
        QueryWrapper<FoodCategory> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("shopId",shopId)
                .eq("status",status);
        return this.baseMapper.selectList(queryWrapper);
    }
}
