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
 * 订单--进度详情
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("order_process")
@ApiModel(value="OrderProcess对象", description="订单--进度详情")
public class OrderProcess extends Model<OrderProcess> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单ID")
    @TableField("orderId")
    private String orderId;

    @ApiModelProperty(value = "进度备注内容")
    private String content;

    @ApiModelProperty(value = "理由")
    private String reason;

    @ApiModelProperty(value = "进度状态")
    @TableField("orderStatus")
    private Integer orderStatus;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "加入时间")
    @TableField("addTime")
    private Integer addTime;

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
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderProcess{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", content=" + content +
        ", reason=" + reason +
        ", orderStatus=" + orderStatus +
        ", status=" + status +
        ", addTime=" + addTime +
        "}";
    }
}
