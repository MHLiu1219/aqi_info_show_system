package com.lmh.aqishow.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "aqi_gzaqi_station")
public class AqiGzaqiStation implements Serializable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 区/县级市 监测点所在区
     */
    @Column(name = "st_code")
    private String stCode;

    /**
     * 监测站名称
     */
    @Column(name = "station_name")
    private String stationName;

    /**
     * 显示名称
     */
    @Column(name = "display_name")
    private String displayName;

    /**
     * 监测站的类型（监测级别），城市趋势点、市站、国控等
     */
    @Column(name = "station_type")
    private String stationType;

    /**
     * 类 我也不知道什么意思
     */
    @Column(name = "station_class")
    private String stationClass;

    /**
     * 监测站所在详细地址
     */
    private String address;

    /**
     * 经度
     */
    private BigDecimal x;

    /**
     * 经度
     */
    private BigDecimal y;

    /**
     * 是否为中心站点
     */
    private String center;

    /**
     * 注释
     */
    private String remark;

    /**
     * 表数据新增时间
     */
    @Column(name = "lmh_create")
    private Date lmhCreate;

    /**
     * 表数据修改时间
     */
    @Column(name = "lmh_modified")
    private Date lmhModified;

    private static final long serialVersionUID = 1L;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取区/县级市 监测点所在区
     *
     * @return st_code - 区/县级市 监测点所在区
     */
    public String getStCode() {
        return stCode;
    }

    /**
     * 设置区/县级市 监测点所在区
     *
     * @param stCode 区/县级市 监测点所在区
     */
    public void setStCode(String stCode) {
        this.stCode = stCode == null ? null : stCode.trim();
    }

    /**
     * 获取监测站名称
     *
     * @return station_name - 监测站名称
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 设置监测站名称
     *
     * @param stationName 监测站名称
     */
    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    /**
     * 获取显示名称
     *
     * @return display_name - 显示名称
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 设置显示名称
     *
     * @param displayName 显示名称
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    /**
     * 获取监测站的类型（监测级别），城市趋势点、市站、国控等
     *
     * @return station_type - 监测站的类型（监测级别），城市趋势点、市站、国控等
     */
    public String getStationType() {
        return stationType;
    }

    /**
     * 设置监测站的类型（监测级别），城市趋势点、市站、国控等
     *
     * @param stationType 监测站的类型（监测级别），城市趋势点、市站、国控等
     */
    public void setStationType(String stationType) {
        this.stationType = stationType == null ? null : stationType.trim();
    }

    /**
     * 获取类 我也不知道什么意思
     *
     * @return station_class - 类 我也不知道什么意思
     */
    public String getStationClass() {
        return stationClass;
    }

    /**
     * 设置类 我也不知道什么意思
     *
     * @param stationClass 类 我也不知道什么意思
     */
    public void setStationClass(String stationClass) {
        this.stationClass = stationClass == null ? null : stationClass.trim();
    }

    /**
     * 获取监测站所在详细地址
     *
     * @return address - 监测站所在详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置监测站所在详细地址
     *
     * @param address 监测站所在详细地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取经度
     *
     * @return x - 经度
     */
    public BigDecimal getX() {
        return x;
    }

    /**
     * 设置经度
     *
     * @param x 经度
     */
    public void setX(BigDecimal x) {
        this.x = x;
    }

    /**
     * 获取经度
     *
     * @return y - 经度
     */
    public BigDecimal getY() {
        return y;
    }

    /**
     * 设置经度
     *
     * @param y 经度
     */
    public void setY(BigDecimal y) {
        this.y = y;
    }

    /**
     * 获取是否为中心站点
     *
     * @return center - 是否为中心站点
     */
    public String getCenter() {
        return center;
    }

    /**
     * 设置是否为中心站点
     *
     * @param center 是否为中心站点
     */
    public void setCenter(String center) {
        this.center = center == null ? null : center.trim();
    }

    /**
     * 获取注释
     *
     * @return remark - 注释
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置注释
     *
     * @param remark 注释
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取表数据新增时间
     *
     * @return lmh_create - 表数据新增时间
     */
    public Date getLmhCreate() {
        return lmhCreate;
    }

    /**
     * 设置表数据新增时间
     *
     * @param lmhCreate 表数据新增时间
     */
    public void setLmhCreate(Date lmhCreate) {
        this.lmhCreate = lmhCreate;
    }

    /**
     * 获取表数据修改时间
     *
     * @return lmh_modified - 表数据修改时间
     */
    public Date getLmhModified() {
        return lmhModified;
    }

    /**
     * 设置表数据修改时间
     *
     * @param lmhModified 表数据修改时间
     */
    public void setLmhModified(Date lmhModified) {
        this.lmhModified = lmhModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stCode=").append(stCode);
        sb.append(", stationName=").append(stationName);
        sb.append(", displayName=").append(displayName);
        sb.append(", stationType=").append(stationType);
        sb.append(", stationClass=").append(stationClass);
        sb.append(", address=").append(address);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", center=").append(center);
        sb.append(", remark=").append(remark);
        sb.append(", lmhCreate=").append(lmhCreate);
        sb.append(", lmhModified=").append(lmhModified);
        sb.append("]");
        return sb.toString();
    }
}