package com.hanergy.out.controller;

import com.hanergy.out.entity.FoodCategory;
import com.hanergy.out.service.IFoodCategoryService;
import com.hanergy.out.service.IFoodService;
import com.hanergy.out.utils.R;
import com.hanergy.out.vo.FoodVo;
import com.hanergy.out.vo.MenuVo;
import com.hanergy.out.vo.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IFoodCategoryService foodCategoryService;

    @Autowired
    private IFoodService foodService;

    @GetMapping("/list")
    public R menuList(@RequestParam("shopId") Integer shopId){
        //获取店铺生效中的菜单列表
        List<FoodCategory> cateList= foodCategoryService.findByShopIdAndStatus(shopId, StatusEnum.DEVICE_RETURN.getCode());
        if (cateList != null && cateList.size() > 0){
            for (FoodCategory category : cateList){
                List<FoodVo> foods = foodService.findByShopId(category.getId());
                category.setFoods(foods);
            }
        }
        return R.ok(1,cateList);
    }

    @GetMapping("detail")
    public R mentDetail(@RequestParam("menuId") Integer menuId, @RequestParam("type") Integer type){
        List<FoodVo> foods = new ArrayList<>();
        if (type == 0) {
            foods = foodService.findByShopId(menuId);
        } else {    //热销菜单
            foods = foodService.findTop20Sell();
        }
        return R.ok(1,foods);
    }
}
