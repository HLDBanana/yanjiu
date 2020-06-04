package com.hanergy.out.controller;

import com.hanergy.out.utils.FileDfsUtils;
import com.hanergy.out.utils.R;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

@RestController
@RequestMapping("/file")
public class FileManageController {

    @Autowired
    private FileDfsUtils fileDfsUtils;



    /**
     * 文件上传
     */
    @ApiOperation(value="上传文件", notes="测试FastDFS文件上传")
    @PostMapping(value = "/uploadFile",headers="content-type=multipart/form-data")
    public R uploadFile (@RequestParam("file") MultipartFile file){
        String result ;
        try{
            String path = fileDfsUtils.upload(file);
            if (!StringUtils.isEmpty(path)){
                result = path ;
            } else {
                result = "上传失败" ;
            }
        } catch (Exception e){
            e.printStackTrace() ;
            result = "服务异常" ;
        }
        return R.ok(1,result);
    }

    @GetMapping("/download")
    public void downFile(@RequestParam("url") String url,HttpServletResponse response) throws Exception {
        byte[] bytes = fileDfsUtils.downFile(url);
        //设置相应类型application/octet-stream        （注：applicatoin/octet-stream 为通用，一些其它的类型苹果浏览器下载内容可能为空）
        response.reset();
        response.setContentType("applicatoin/octet-stream");
        //设置头信息                 Content-Disposition为属性名  附件形式打开下载文件   指定名称  为 设定的fileName
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("123.png", "UTF-8"));
        // 写入到流
        ServletOutputStream out = response.getOutputStream();
        out.write(bytes);
        out.close();

    }
}
