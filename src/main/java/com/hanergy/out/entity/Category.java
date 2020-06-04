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
 * 分类表
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("category")
@ApiModel(value="Category对象", description="分类表")
public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "分类类型")
    private Integer type;

    @ApiModelProperty(value = "分类名字")
    private String name;

    @ApiModelProperty(value = "图片")
    private String cover;

    @ApiModelProperty(value = "上一级ID")
    private Integer parentId;

    @ApiModelProperty(value = "简单的描述")
    private String desc;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "加入时间")
    @TableField("addTime")
    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "Category{" +
        "id=" + id +
        ", type=" + type +
        ", name=" + name +
        ", cover=" + cover +
        ", parentId=" + parentId +
        ", desc=" + desc +
        ", status=" + status +
        ", addTime=" + addTime +
        "}";
    }
}
