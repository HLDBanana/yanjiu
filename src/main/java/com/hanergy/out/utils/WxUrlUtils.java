package com.hanergy.out.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.yml")
public class WxUrlUtils {


    private static Logger log = LoggerFactory.getLogger(WxUrlUtils.class);

    /**
     * 获取accesstoken
     */
    //https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET
    public static final String getToken = "https://api.weixin.qq.com/cgi-bin/token";

    /**
     * 创建菜单
     */
    //https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN
    public static final String createMenu = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=";




    @Value("${wx.appid}")
    private String appid;

    @Value("${wx.secret}")
    private String secret;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
