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
 * 订单--评论
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("order_comment")
@ApiModel(value="OrderComment对象", description="订单--评论")
public class OrderComment extends Model<OrderComment> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单ID")
    @TableField("orderId")
    private String orderId;

    @ApiModelProperty(value = "用户ID")
    @TableField("userId")
    private Integer userId;

    @ApiModelProperty(value = "评论内容")
    private String content;

    @ApiModelProperty(value = "评论图片")
    private String images;

    @ApiModelProperty(value = "加入时间")
    @TableField("addTme")
    private Integer addTme;

    @ApiModelProperty(value = "回复的ID路径:1/2/3/5")
    private String path;

    @ApiModelProperty(value = "点赞次数")
    @TableField("numPraise")
    private Integer numPraise;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "引用的评论ID")
    @TableField("reCommentId")
    private Integer reCommentId;

    @ApiModelProperty(value = "点赞用户的IDs")
    @TableField("likeIds")
    private String likeIds;

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
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
    public Integer getAddTme() {
        return addTme;
    }

    public void setAddTme(Integer addTme) {
        this.addTme = addTme;
    }
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public Integer getNumPraise() {
        return numPraise;
    }

    public void setNumPraise(Integer numPraise) {
        this.numPraise = numPraise;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getReCommentId() {
        return reCommentId;
    }

    public void setReCommentId(Integer reCommentId) {
        this.reCommentId = reCommentId;
    }
    public String getLikeIds() {
        return likeIds;
    }

    public void setLikeIds(String likeIds) {
        this.likeIds = likeIds;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderComment{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", userId=" + userId +
        ", content=" + content +
        ", images=" + images +
        ", addTme=" + addTme +
        ", path=" + path +
        ", numPraise=" + numPraise +
        ", status=" + status +
        ", reCommentId=" + reCommentId +
        ", likeIds=" + likeIds +
        "}";
    }
}
