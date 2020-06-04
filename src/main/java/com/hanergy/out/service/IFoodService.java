package com.hanergy.out.service;

import com.hanergy.out.entity.Food;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hanergy.out.vo.FoodVo;

import java.util.List;

/**
 * <p>
 * 商品信息表 服务类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
public interface IFoodService extends IService<Food> {


    /**
     *  获取下级菜单 并根据销量排序
     * @param menuId 菜单id
     * @return
     */
    public List<FoodVo> findByShopId(Integer menuId);

    /**
     * 获取销量前20商品
     * @return
     */
    public List<FoodVo> findTop20Sell();

}
