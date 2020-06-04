package com.hanergy.out.controller;

import com.hanergy.out.entity.UserAddress;
import com.hanergy.out.service.IUserAddressService;
import com.hanergy.out.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/address")
@RestController
public class AddressController {

    @Autowired
    private IUserAddressService userAddressService;


    @PostMapping("/save")
    public R saveOrUpdate(@RequestBody UserAddress address){
        boolean suc = false;
        if (address.getId() != null){
            suc = userAddressService.updateById(address);
        } else {
            suc = userAddressService.save(address);
        }
        if (!suc){
            return R.error();
        }
        return R.ok();
    }

    @GetMapping("/delete")
    public R delete(@RequestParam("id") Integer id){
        boolean del = userAddressService.removeById(id);
        if (!del){
            return R.error();
        }
        return R.ok();
    }




}
