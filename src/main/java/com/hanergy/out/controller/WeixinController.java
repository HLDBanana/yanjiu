package com.hanergy.out.controller;

import com.hanergy.out.utils.WXPayUtil;
import com.hanergy.out.vo.TextMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;

@RestController
public class WeixinController {



    @GetMapping("/wx")
    public String wx(HttpServletRequest request, String echostr){
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");

        String token = "hld";
        String[] arr = new String[]{timestamp,token,nonce};
        Arrays.sort(arr);
        //生成字符串
        StringBuffer content = new StringBuffer();
        for (String s:arr) {
            content.append(s);
        }
        String temp = getSha1(content.toString());
        if(temp.equals(signature)){
            return echostr;
        };
        return "";
    }


    @PostMapping("/wx")
    public String wechartMsg(HttpServletRequest request, String echostr) throws Exception {
        InputStream inputStream =  request.getInputStream();

//BufferedReader是包装设计模式，性能更搞
        BufferedReader in =  new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
        StringBuffer sb = new StringBuffer();
        String line ;
        while ((line = in.readLine()) != null){
            sb.append(line);
        }
        in.close();
        inputStream.close();

        Map<String,String> map = WXPayUtil.xmlToMap(sb.toString());
        //用户openid
        String fromUserName = map.get("FromUserName");
        //开发者微信号
        String toUserName = map.get("ToUserName");
        //消息类型
        String msgType = map.get("MsgType");
        //事件类型
        String event = map.get("Event");
        // 回复消息内容
        map.put("FromUserName",toUserName);
        map.put("ToUserName",fromUserName);
        map.put("MsgType","text");
        map.put("Content","i am hld ,how are you");
        map.put("CreateTime",String.valueOf(System.currentTimeMillis()));
        TextMessage message = new TextMessage();
        //message.setFromUserName(fromUserName);
        //message.setToUserName(toUserName);
        message.setFromUserName(toUserName);
        message.setToUserName(fromUserName);
        message.setMsgType("text");
        message.setContent("i am  hld ,how are you");
        message.setCreateTime(System.currentTimeMillis());
        String msg = WXPayUtil.mapToXml(map);
        msg.getBytes("UTF-8");
        return msg;
    }

    public static String getSha1(String str){
        if(str==null||str.length()==0){
            return null;
        }
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9',
                'a','b','c','d','e','f'};
        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));
            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j*2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }
}
