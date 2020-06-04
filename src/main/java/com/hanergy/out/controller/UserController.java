package com.hanergy.out.controller;

import com.hanergy.out.entity.User;
import com.hanergy.out.service.IUserService;
import com.hanergy.out.utils.DateUtils;
import com.hanergy.out.utils.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value="保存新用户信息",notes="保存新用户信息")
    @PostMapping("/save")
    public R saveUser(@RequestBody User user){
        //通过openid获取用户信息
        User userDetail = userService.findByOpenId(user.getOpenId());
        //当前为新用户
        if (userDetail == null){
            user.setAddTime(new Date());
            user.setStatus(1);
            boolean success = userService.save(user);
            if (!success){
                return R.error();
            }
        }
        return R.ok();
    }



}
