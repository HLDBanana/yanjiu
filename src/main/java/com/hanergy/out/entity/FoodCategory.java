package com.hanergy.out.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.ArrayList;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.List;

import com.hanergy.out.vo.FoodVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商家的商品分类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("food_category")
@ApiModel(value="FoodCategory对象", description="商家的商品分类")
public class FoodCategory extends Model<FoodCategory> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "商铺ID")
    @TableField("shopId")
    private Integer shopId;

    @ApiModelProperty(value = "分类类型")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "状态")
    private Integer status;


    @ApiModelProperty(value = "0:固定下级  1：实时计算下级")
    private Integer type;

    @ApiModelProperty(value = "加入时间")
    @TableField("addTime")
    private Date addTime;

    @TableField(exist = false)
    private List<FoodVo> foods = new ArrayList<>();

    public List<FoodVo> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodVo> foods) {
        this.foods = foods;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "FoodCategory{" +
        "id=" + id +
        ", shopId=" + shopId +
        ", name=" + name +
        ", description=" + description +
        ", status=" + status +
        ", addTime=" + addTime +
        "}";
    }
}
