package com.hanergy.out.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("file_upload")
@ApiModel(value="FileUpload对象", description="")
public class FileUpload extends Model<FileUpload> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "文件名称")
    @TableField("fileName")
    private String fileName;

    @ApiModelProperty(value = "文件类型")
    @TableField("contentType")
    private String contentType;

    @ApiModelProperty(value = "上传之后的url地址")
    private String url;

    @ApiModelProperty(value = "创建时间")
    @TableField("addTime")
    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "FileUpload{" +
        "id=" + id +
        ", fileName=" + fileName +
        ", contentType=" + contentType +
        ", url=" + url +
        ", addTime=" + addTime +
        "}";
    }
}
