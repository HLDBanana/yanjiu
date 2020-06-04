package com.hanergy.out.service.impl;

import com.hanergy.out.entity.Shop;
import com.hanergy.out.dao.ShopMapper;
import com.hanergy.out.service.IShopService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hanergy.out.vo.LocationVo;
import com.hanergy.out.vo.ShopVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 店铺信息 服务实现类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements IShopService {

    @Override
    public List<ShopVo> orderByJuli(LocationVo location) {
        Integer start = location.getPageNo() * location.getPageSize();
        location.setStart(start);

        return this.baseMapper.orderByJuli(location);
    }

    @Override
    public ShopVo findDetailById(Integer id) {

        return this.baseMapper.findDetailById(id);
    }
}
