package com.hanergy.out.controller;

import com.hanergy.out.utils.HttpClient;
import com.hanergy.out.utils.R;
import com.hanergy.out.utils.WxUrlUtils;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/token")
public class AccessTokenController {

    @Autowired
    private WxUrlUtils wxUrlUtils;

    @GetMapping("/get")
    public R getAccessToken(){

        String url = WxUrlUtils.getToken + "?grant_type=client_credential&appid=" + wxUrlUtils.getAppid() + "&secret=" + wxUrlUtils.getSecret();

        String result = HttpClient.sendGetRequest(url,null,null);

        JSONObject json = JSONObject.fromObject(result);
        // accesstoken
        String accessToken = json.getString("access_token");
        // 过期时间
        int expires = json.getInt("expires_in");

        return R.ok(1,accessToken);
    }
}
