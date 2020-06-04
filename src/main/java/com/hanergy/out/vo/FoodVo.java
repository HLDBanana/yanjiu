package com.hanergy.out.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@ApiModel(value="Food对象", description="商品信息表")
public class FoodVo extends Model<FoodVo> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "商店ID")
    private Integer shopId;

    @ApiModelProperty(value = "分类ID")
    private Integer cateId;

    @ApiModelProperty(value = "名字")
    private String title;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "商品封面图")
    private String cover;

    @ApiModelProperty(value = "原价")
    private BigDecimal originPrice;

    @ApiModelProperty(value = "售价")
    private BigDecimal sellPrice;

    @ApiModelProperty(value = "折扣")
    private BigDecimal discount;

    @ApiModelProperty(value = "点赞")
    private Integer like;

    @ApiModelProperty(value = "限购数量")
    private Integer limitNum;

    @ApiModelProperty(value = "规格选项")
    private String option;

    @ApiModelProperty(value = "总的销量")
    private Integer totalSales;

    @ApiModelProperty(value = "月销量")
    private Integer monthSales;

    @ApiModelProperty(value = "好评率")
    private Float praiseRate;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "加入时间")
    private Date addTime;

    @ApiModelProperty(value = "总销量")
    private Integer sellNum;

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
    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    public BigDecimal getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(BigDecimal originPrice) {
        this.originPrice = originPrice;
    }
    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
    public Integer getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }
    public Integer getMonthSales() {
        return monthSales;
    }

    public void setMonthSales(Integer monthSales) {
        this.monthSales = monthSales;
    }
    public Float getPraiseRate() {
        return praiseRate;
    }

    public void setPraiseRate(Float praiseRate) {
        this.praiseRate = praiseRate;
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

    public Integer getSellNum() {
        return sellNum;
    }

    public void setSellNum(Integer sellNum) {
        this.sellNum = sellNum;
    }

    @Override
    public String toString() {
        return "Food{" +
        "id=" + id +
        ", shopId=" + shopId +
        ", cateId=" + cateId +
        ", title=" + title +
        ", desc=" + desc +
        ", cover=" + cover +
        ", originPrice=" + originPrice +
        ", sellPrice=" + sellPrice +
        ", discount=" + discount +
        ", like=" + like +
        ", limitNum=" + limitNum +
        ", option=" + option +
        ", totalSales=" + totalSales +
        ", monthSales=" + monthSales +
        ", praiseRate=" + praiseRate +
        ", status=" + status +
        ", addTime=" + addTime +
        "}";
    }
}
