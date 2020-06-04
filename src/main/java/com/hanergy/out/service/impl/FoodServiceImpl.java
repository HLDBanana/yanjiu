package com.hanergy.out.service.impl;

import com.hanergy.out.entity.Food;
import com.hanergy.out.dao.FoodMapper;
import com.hanergy.out.service.IFoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hanergy.out.vo.FoodVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品信息表 服务实现类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements IFoodService {


    @Override
    public List<FoodVo> findByShopId(Integer menuId) {
        return this.baseMapper.findByShopId(menuId);
    }

    @Override
    public List<FoodVo> findTop20Sell() {
        return this.baseMapper.findTop20Sell();
    }
}
