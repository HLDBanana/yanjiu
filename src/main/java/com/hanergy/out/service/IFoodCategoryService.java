package com.hanergy.out.service;

import com.hanergy.out.entity.FoodCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商家的商品分类 服务类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
public interface IFoodCategoryService extends IService<FoodCategory> {

    /**
     * 获取店铺菜单列表
     * @param shopId    店铺id
     * @param status    状态 0：失效 1：生效
     * @return
     */
    public List<FoodCategory> findByShopIdAndStatus(Integer shopId,Integer status);

}
