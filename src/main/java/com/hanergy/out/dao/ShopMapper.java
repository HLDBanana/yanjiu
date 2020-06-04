package com.hanergy.out.dao;

import com.hanergy.out.entity.Shop;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hanergy.out.vo.LocationVo;
import com.hanergy.out.vo.ShopVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 店铺信息 Mapper 接口
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Mapper
public interface ShopMapper extends BaseMapper<Shop> {

    public List<ShopVo> orderByJuli(LocationVo locationVo);

    /**
     * 根据距离排序所有商家
     * @param id  商家id
     * @return
     */
    public ShopVo findDetailById(@Param("id") Integer id);
}
