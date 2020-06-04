package com.hanergy.out.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商家活动
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("shop_activity")
@ApiModel(value="ShopActivity对象", description="商家活动")
public class ShopActivity extends Model<ShopActivity> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "活动分类")
    private Integer type;

    @ApiModelProperty(value = "商铺ID")
    private Integer shopId;

    @ApiModelProperty(value = "满足的消费金额")
    private BigDecimal target;

    @ApiModelProperty(value = "优惠金额")
    private BigDecimal cut;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "加入时间")
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
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
    public BigDecimal getTarget() {
        return target;
    }

    public void setTarget(BigDecimal target) {
        this.target = target;
    }
    public BigDecimal getCut() {
        return cut;
    }

    public void setCut(BigDecimal cut) {
        this.cut = cut;
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
        return "ShopActivity{" +
        "id=" + id +
        ", type=" + type +
        ", shopId=" + shopId +
        ", target=" + target +
        ", cut=" + cut +
        ", status=" + status +
        ", addTime=" + addTime +
        "}";
    }
}
