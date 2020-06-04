package com.hanergy.out.controller;

import com.hanergy.out.service.IShopService;
import com.hanergy.out.utils.R;
import com.hanergy.out.vo.LocationVo;
import com.hanergy.out.vo.ShopVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class shopController {

    @Autowired
    private IShopService shopService;

    @PostMapping("/list")
    public R shopList(@RequestBody LocationVo location){

        List<ShopVo> shops = shopService.orderByJuli(location);
        return R.ok(1,shops);
    }

    @GetMapping("/detail")
    public R shopList(@RequestParam("id") Integer id){

        ShopVo shop = shopService.findDetailById(id);

        return R.ok(1,shop);
    }

}
