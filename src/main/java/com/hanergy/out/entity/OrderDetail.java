package com.hanergy.out.entity;

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
 * 订单详情表
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("order_detail")
@ApiModel(value="OrderDetail对象", description="订单详情表")
public class OrderDetail extends Model<OrderDetail> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单ID")
    @TableField("orderId")
    private String orderId;

    @ApiModelProperty(value = "用户名")
    @TableField("userUsername")
    private String userUsername;

    @ApiModelProperty(value = "用户联系电话")
    @TableField("userMobile")
    private String userMobile;

    @ApiModelProperty(value = "用户地址ID")
    @TableField("userAddressId")
    private Integer userAddressId;

    @ApiModelProperty(value = "用户详细地址")
    @TableField("userAddress")
    private String userAddress;

    @ApiModelProperty(value = "用户地址-经度")
    @TableField("userLongitude")
    private String userLongitude;

    @ApiModelProperty(value = "用户地址-纬度")
    @TableField("userLatitude")
    private String userLatitude;

    @ApiModelProperty(value = "商铺名字")
    @TableField("shopShopname")
    private String shopShopname;

    @ApiModelProperty(value = "商铺联系电话")
    @TableField("shopMobile")
    private String shopMobile;

    @ApiModelProperty(value = "商铺详细地址")
    @TableField("shopAddress")
    private String shopAddress;

    @ApiModelProperty(value = "商铺地址-经度")
    @TableField("shopLongitude")
    private String shopLongitude;

    @ApiModelProperty(value = "商铺地址-纬度")
    @TableField("shopLatitude")
    private String shopLatitude;

    @ApiModelProperty(value = "配送员ID")
    @TableField("deliverId")
    private Integer deliverId;

    @ApiModelProperty(value = "配送员姓名")
    @TableField("deliverName")
    private String deliverName;

    @ApiModelProperty(value = "配送员联系电话")
    @TableField("deliverMobile")
    private String deliverMobile;

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
    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }
    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
    public Integer getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Integer userAddressId) {
        this.userAddressId = userAddressId;
    }
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public String getUserLongitude() {
        return userLongitude;
    }

    public void setUserLongitude(String userLongitude) {
        this.userLongitude = userLongitude;
    }
    public String getUserLatitude() {
        return userLatitude;
    }

    public void setUserLatitude(String userLatitude) {
        this.userLatitude = userLatitude;
    }
    public String getShopShopname() {
        return shopShopname;
    }

    public void setShopShopname(String shopShopname) {
        this.shopShopname = shopShopname;
    }
    public String getShopMobile() {
        return shopMobile;
    }

    public void setShopMobile(String shopMobile) {
        this.shopMobile = shopMobile;
    }
    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
    public String getShopLongitude() {
        return shopLongitude;
    }

    public void setShopLongitude(String shopLongitude) {
        this.shopLongitude = shopLongitude;
    }
    public String getShopLatitude() {
        return shopLatitude;
    }

    public void setShopLatitude(String shopLatitude) {
        this.shopLatitude = shopLatitude;
    }
    public Integer getDeliverId() {
        return deliverId;
    }

    public void setDeliverId(Integer deliverId) {
        this.deliverId = deliverId;
    }
    public String getDeliverName() {
        return deliverName;
    }

    public void setDeliverName(String deliverName) {
        this.deliverName = deliverName;
    }
    public String getDeliverMobile() {
        return deliverMobile;
    }

    public void setDeliverMobile(String deliverMobile) {
        this.deliverMobile = deliverMobile;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", userUsername=" + userUsername +
        ", userMobile=" + userMobile +
        ", userAddressId=" + userAddressId +
        ", userAddress=" + userAddress +
        ", userLongitude=" + userLongitude +
        ", userLatitude=" + userLatitude +
        ", shopShopname=" + shopShopname +
        ", shopMobile=" + shopMobile +
        ", shopAddress=" + shopAddress +
        ", shopLongitude=" + shopLongitude +
        ", shopLatitude=" + shopLatitude +
        ", deliverId=" + deliverId +
        ", deliverName=" + deliverName +
        ", deliverMobile=" + deliverMobile +
        "}";
    }
}
