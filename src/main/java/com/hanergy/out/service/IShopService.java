package com.hanergy.out.service;

import com.hanergy.out.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hanergy.out.vo.LocationVo;
import com.hanergy.out.vo.ShopVo;

import java.util.List;

/**
 * <p>
 * 店铺信息 服务类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
public interface IShopService extends IService<Shop> {

    /**
     * 根据距离排序所有商家
     * @param location
     * @return
     */
    public List<ShopVo> orderByJuli(LocationVo location);

    /**
     * 根据距离排序所有商家
     * @param id  商家id
     * @return
     */
    public ShopVo findDetailById(Integer id);
}
