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
 * 
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@TableName("region")
@ApiModel(value="Region对象", description="")
public class Region extends Model<Region> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域主键")
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @ApiModelProperty(value = "区域名称")
    private String name;

    @ApiModelProperty(value = "区域上级标识")
    private Integer pid;

    @ApiModelProperty(value = "地名简称")
    private String sname;

    @ApiModelProperty(value = "区域等级")
    private Integer level;

    @ApiModelProperty(value = "区域编码")
    private String citycode;

    @ApiModelProperty(value = "邮政编码")
    private String yzcode;

    @ApiModelProperty(value = "组合名称")
    private String mername;

    @TableField("Lng")
    private Float Lng;

    @TableField("Lat")
    private Float Lat;

    private String pinyin;

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
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }
    public String getYzcode() {
        return yzcode;
    }

    public void setYzcode(String yzcode) {
        this.yzcode = yzcode;
    }
    public String getMername() {
        return mername;
    }

    public void setMername(String mername) {
        this.mername = mername;
    }
    public Float getLng() {
        return Lng;
    }

    public void setLng(Float Lng) {
        this.Lng = Lng;
    }
    public Float getLat() {
        return Lat;
    }

    public void setLat(Float Lat) {
        this.Lat = Lat;
    }
    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Region{" +
        "id=" + id +
        ", name=" + name +
        ", pid=" + pid +
        ", sname=" + sname +
        ", level=" + level +
        ", citycode=" + citycode +
        ", yzcode=" + yzcode +
        ", mername=" + mername +
        ", Lng=" + Lng +
        ", Lat=" + Lat +
        ", pinyin=" + pinyin +
        "}";
    }
}
