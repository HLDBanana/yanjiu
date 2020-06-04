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
 * 订单商品详情表
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("order_food")
@ApiModel(value="OrderFood对象", description="订单商品详情表")
public class OrderFood extends Model<OrderFood> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单ID")
    @TableField("orderId")
    private String orderId;

    @ApiModelProperty(value = "商铺ID")
    @TableField("shopId")
    private Integer shopId;

    @ApiModelProperty(value = "商铺名称")
    private String shopname;

    @ApiModelProperty(value = "商品ID")
    @TableField("foodId")
    private Integer foodId;

    @ApiModelProperty(value = "商品标题")
    private String title;

    @ApiModelProperty(value = "商品封面")
    private String cover;

    @ApiModelProperty(value = "原价")
    @TableField("originPrice")
    private BigDecimal originPrice;

    @ApiModelProperty(value = "售价")
    @TableField("sellPrice")
    private BigDecimal sellPrice;

    @ApiModelProperty(value = "下单数量")
    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }
    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderFood{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", shopId=" + shopId +
        ", shopname=" + shopname +
        ", foodId=" + foodId +
        ", title=" + title +
        ", cover=" + cover +
        ", originPrice=" + originPrice +
        ", sellPrice=" + sellPrice +
        ", number=" + number +
        "}";
    }
}
