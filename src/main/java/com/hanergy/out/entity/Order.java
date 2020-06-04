package com.hanergy.out.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 订单主表
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("order")
@ApiModel(value="Order对象", description="订单主表")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户ID")
    @TableField("userId")
    private Integer userId;

    @ApiModelProperty(value = "商铺ID")
    @TableField("shopId")
    private Integer shopId;

    @ApiModelProperty(value = "配送费")
    @TableField("sendCost")
    private BigDecimal sendCost;

    @ApiModelProperty(value = "总价")
    @TableField("totalMoney")
    private BigDecimal totalMoney;

    @ApiModelProperty(value = "优惠金额")
    @TableField("discountMoney")
    private BigDecimal discountMoney;

    @ApiModelProperty(value = "红包ID")
    @TableField("couponId")
    private String couponId;

    @ApiModelProperty(value = "红包满减金额")
    @TableField("couponMoney")
    private BigDecimal couponMoney;

    @ApiModelProperty(value = "实付金额")
    @TableField("payMoney")
    private BigDecimal payMoney;

    @ApiModelProperty(value = "支付方式")
    @TableField("payWay")
    private Integer payWay;

    @ApiModelProperty(value = "加入时间")
    private Integer addTime;

    @ApiModelProperty(value = "状态")
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
    public BigDecimal getSendCost() {
        return sendCost;
    }

    public void setSendCost(BigDecimal sendCost) {
        this.sendCost = sendCost;
    }
    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }
    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
    public BigDecimal getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(BigDecimal couponMoney) {
        this.couponMoney = couponMoney;
    }
    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }
    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }
    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Order{" +
        "id=" + id +
        ", userId=" + userId +
        ", shopId=" + shopId +
        ", sendCost=" + sendCost +
        ", totalMoney=" + totalMoney +
        ", discountMoney=" + discountMoney +
        ", couponId=" + couponId +
        ", couponMoney=" + couponMoney +
        ", payMoney=" + payMoney +
        ", payWay=" + payWay +
        ", addTime=" + addTime +
        ", status=" + status +
        "}";
    }
}
