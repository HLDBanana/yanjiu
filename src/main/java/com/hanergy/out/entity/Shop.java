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
 * 店铺信息
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("shop")
@ApiModel(value="Shop对象", description="店铺信息")
public class Shop extends Model<Shop> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "地点名")
    private String name;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "电话号码")
    private String tel;

    @ApiModelProperty(value = "描述")
    private String contact;

    @ApiModelProperty(value = "经度")
    private Double lat;

    @ApiModelProperty(value = "纬度")
    private Double lng;

    @ApiModelProperty(value = "分类 ")
    private Integer type;

    @ApiModelProperty(value = "商店类型")
    @TableField("typeName")
    private String typeName;

    @ApiModelProperty(value = "商店图片")
    private String logo;

    @ApiModelProperty(value = "0为正常状态 1为被删除")
    @TableField("opStatus")
    private Integer opStatus;

    @ApiModelProperty(value = "合作热线")
    @TableField("cooperationPhone")
    private String cooperationPhone;

    @ApiModelProperty(value = "营业执照号")
    @TableField("businesLicense")
    private String businesLicense;

    @ApiModelProperty(value = "营业执照，多张照片以逗号隔开")
    @TableField("licenseImage")
    private String licenseImage;

    @ApiModelProperty(value = "法人身份证，多张图片以逗号隔开")
    @TableField("legalPersonImage")
    private String legalPersonImage;

    @ApiModelProperty(value = "区域信息")
    @TableField("regionId")
    private Integer regionId;

    @ApiModelProperty(value = "添加时间")
    @TableField("addTime")
    private Date addTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private Date updateTime;

    @ApiModelProperty(value = "最小配送金额")
    @TableField("floorSendCost")
    private Integer floorSendCost;

    @ApiModelProperty(value = "配送费")
    @TableField("sendCost")
    private Integer sendCost;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "营业开始时间")
    @TableField("beginTime")
    private Integer beginTime;

    @ApiModelProperty(value = "营业结束时间")
    @TableField("endTime")
    private Integer endTime;

    @ApiModelProperty(value = "多张图片以逗号分隔")
    @TableField("otherImages")
    private String otherImages;

    @ApiModelProperty(value = "评分")
    private Double source;

    @ApiModelProperty(value = "商家公告")
    private String notice;

    @ApiModelProperty(value = "配送时间")
    @TableField("sendTime")
    private String sendTime;


    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    public Integer getOpStatus() {
        return opStatus;
    }

    public void setOpStatus(Integer opStatus) {
        this.opStatus = opStatus;
    }
    public String getCooperationPhone() {
        return cooperationPhone;
    }

    public void setCooperationPhone(String cooperationPhone) {
        this.cooperationPhone = cooperationPhone;
    }
    public String getBusinesLicense() {
        return businesLicense;
    }

    public void setBusinesLicense(String businesLicense) {
        this.businesLicense = businesLicense;
    }
    public String getLicenseImage() {
        return licenseImage;
    }

    public void setLicenseImage(String licenseImage) {
        this.licenseImage = licenseImage;
    }
    public String getLegalPersonImage() {
        return legalPersonImage;
    }

    public void setLegalPersonImage(String legalPersonImage) {
        this.legalPersonImage = legalPersonImage;
    }
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Integer getFloorSendCost() {
        return floorSendCost;
    }

    public void setFloorSendCost(Integer floorSendCost) {
        this.floorSendCost = floorSendCost;
    }
    public Integer getSendCost() {
        return sendCost;
    }

    public void setSendCost(Integer sendCost) {
        this.sendCost = sendCost;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
    public String getOtherImages() {
        return otherImages;
    }

    public void setOtherImages(String otherImages) {
        this.otherImages = otherImages;
    }
    public Double getSource() {
        return source;
    }

    public void setSource(Double source) {
        this.source = source;
    }
    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Shop{" +
        "id=" + id +
        ", name=" + name +
        ", address=" + address +
        ", tel=" + tel +
        ", contact=" + contact +
        ", lat=" + lat +
        ", lng=" + lng +
        ", type=" + type +
        ", typeName=" + typeName +
        ", logo=" + logo +
        ", opStatus=" + opStatus +
        ", cooperationPhone=" + cooperationPhone +
        ", businesLicense=" + businesLicense +
        ", licenseImage=" + licenseImage +
        ", legalPersonImage=" + legalPersonImage +
        ", regionId=" + regionId +
        ", addTime=" + addTime +
        ", updateTime=" + updateTime +
        ", floorSendCost=" + floorSendCost +
        ", sendCost=" + sendCost +
        ", description=" + description +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", otherImages=" + otherImages +
        ", source=" + source +
        ", notice=" + notice +
        "}";
    }
}
