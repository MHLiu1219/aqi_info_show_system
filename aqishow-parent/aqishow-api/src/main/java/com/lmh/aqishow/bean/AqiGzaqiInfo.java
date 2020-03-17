package com.lmh.aqishow.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "aqi_gzaqi_info")
public class AqiGzaqiInfo implements Serializable {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 监测站名称
     */
    private String dwname;

    /**
     * 官方数据更新时间
     */
    @Column(name = "aqi_update_time")
    private Date aqiUpdateTime;

    /**
     *  空气质量指数
     */
    private Integer aqi;

    /**
     * 空气质量分指数-SO2_1H
     */
    @Column(name = "so2_1h_iaqi")
    private Integer so21hIaqi;

    /**
     * 空气质量分指数-NO2_1H
     */
    @Column(name = "no2_1h_iaqi")
    private Short no21hIaqi;

    /**
     * 空气质量分指数-PM10_1H
     */
    @Column(name = "pm10_1h_iaqi")
    private Short pm101hIaqi;

    /**
     * 空气质量分指数-CO_1H
     */
    @Column(name = "co_1h_iaqi")
    private Short co1hIaqi;

    /**
     * 空气质量分指数-O3_1H
     */
    @Column(name = "o3_1h_iaqi")
    private Short o31hIaqi;

    /**
     * 空气质量分指数-O3_8H
     */
    @Column(name = "o3_8h_iaqi")
    private Short o38hIaqi;

    /**
     * 空气质量分指数-PM2_5_1H
     */
    @Column(name = "pm25_1h_iaqi")
    private Short pm251hIaqi;

    /**
     * 空气质量级别
     */
    private String quality;

    /**
     * 注意污染物
     */
    private String primary;

    /**
     * 评价信息
     */
    private String msg;

    /**
     * SO2最近1小时均值，单位微克/立方米
     */
    @Column(name = "so2_1h")
    private Short so21h;

    /**
     * 最近24小时均值，单位微克/立方米
     */
    @Column(name = "so2_24h")
    private Short so224h;

    /**
     * NO2最近1小时均值，单位微克/立方米
     */
    @Column(name = "no2_1h")
    private Short no21h;

    /**
     * NO2最近24小时均值，单位微克/立方米
     */
    @Column(name = "no2_24h")
    private Short no224h;

    /**
     * PM10最近1小时均值，单位微克/立方米
     */
    @Column(name = "pm10_1h")
    private Short pm101h;

    /**
     * PM10最近24小时均值，单位微克/立方米
     */
    @Column(name = "pm10_24h")
    private Short pm1024h;

    /**
     * CO最近1小时均值，毫克/立方米
     */
    @Column(name = "co_1h")
    private BigDecimal co1h;

    /**
     * CO最近24小时均值，毫克/立方米
     */
    @Column(name = "co_24h")
    private BigDecimal co24h;

    /**
     * O3最近1小时均值，单位微克/立方米
     */
    @Column(name = "o3_1h")
    private Short o31h;

    /**
     * O3最近24小时均值，单位微克/立方米
     */
    @Column(name = "o3_1h_24h")
    private Short o31h24h;

    /**
     * O3最近8小时滑动平均值，单位微克/立方米
     */
    @Column(name = "o3_8h")
    private Short o38h;

    /**
     * O3日最近24小时的最大8小时滑动平均值，单位微克/立方米
     */
    @Column(name = "o3_8h_24h")
    private Short o38h24h;

    /**
     * PM2最近1小时均值，单位微克/立方米
     */
    @Column(name = "pm25_1h")
    private Short pm251h;

    /**
     * PM2最近24小时均值，单位微克/立方米
     */
    @Column(name = "pm25_24h")
    private Short pm2524h;

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
     * 获取监测站名称
     *
     * @return dwname - 监测站名称
     */
    public String getDwname() {
        return dwname;
    }

    /**
     * 设置监测站名称
     *
     * @param dwname 监测站名称
     */
    public void setDwname(String dwname) {
        this.dwname = dwname == null ? null : dwname.trim();
    }

    /**
     * 获取官方数据更新时间
     *
     * @return aqi_update_time - 官方数据更新时间
     */
    public Date getAqiUpdateTime() {
        return aqiUpdateTime;
    }

    /**
     * 设置官方数据更新时间
     *
     * @param aqiUpdateTime 官方数据更新时间
     */
    public void setAqiUpdateTime(Date aqiUpdateTime) {
        this.aqiUpdateTime = aqiUpdateTime;
    }

    /**
     * 获取 空气质量指数
     *
     * @return aqi -  空气质量指数
     */
    public Integer getAqi() {
        return aqi;
    }

    /**
     * 设置 空气质量指数
     *
     * @param aqi  空气质量指数
     */
    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    /**
     * 获取空气质量分指数-SO2_1H
     *
     * @return so2_1h_iaqi - 空气质量分指数-SO2_1H
     */
    public Integer getSo21hIaqi() {
        return so21hIaqi;
    }

    /**
     * 设置空气质量分指数-SO2_1H
     *
     * @param so21hIaqi 空气质量分指数-SO2_1H
     */
    public void setSo21hIaqi(Integer so21hIaqi) {
        this.so21hIaqi = so21hIaqi;
    }

    /**
     * 获取空气质量分指数-NO2_1H
     *
     * @return no2_1h_iaqi - 空气质量分指数-NO2_1H
     */
    public Short getNo21hIaqi() {
        return no21hIaqi;
    }

    /**
     * 设置空气质量分指数-NO2_1H
     *
     * @param no21hIaqi 空气质量分指数-NO2_1H
     */
    public void setNo21hIaqi(Short no21hIaqi) {
        this.no21hIaqi = no21hIaqi;
    }

    /**
     * 获取空气质量分指数-PM10_1H
     *
     * @return pm10_1h_iaqi - 空气质量分指数-PM10_1H
     */
    public Short getPm101hIaqi() {
        return pm101hIaqi;
    }

    /**
     * 设置空气质量分指数-PM10_1H
     *
     * @param pm101hIaqi 空气质量分指数-PM10_1H
     */
    public void setPm101hIaqi(Short pm101hIaqi) {
        this.pm101hIaqi = pm101hIaqi;
    }

    /**
     * 获取空气质量分指数-CO_1H
     *
     * @return co_1h_iaqi - 空气质量分指数-CO_1H
     */
    public Short getCo1hIaqi() {
        return co1hIaqi;
    }

    /**
     * 设置空气质量分指数-CO_1H
     *
     * @param co1hIaqi 空气质量分指数-CO_1H
     */
    public void setCo1hIaqi(Short co1hIaqi) {
        this.co1hIaqi = co1hIaqi;
    }

    /**
     * 获取空气质量分指数-O3_1H
     *
     * @return o3_1h_iaqi - 空气质量分指数-O3_1H
     */
    public Short getO31hIaqi() {
        return o31hIaqi;
    }

    /**
     * 设置空气质量分指数-O3_1H
     *
     * @param o31hIaqi 空气质量分指数-O3_1H
     */
    public void setO31hIaqi(Short o31hIaqi) {
        this.o31hIaqi = o31hIaqi;
    }

    /**
     * 获取空气质量分指数-O3_8H
     *
     * @return o3_8h_iaqi - 空气质量分指数-O3_8H
     */
    public Short getO38hIaqi() {
        return o38hIaqi;
    }

    /**
     * 设置空气质量分指数-O3_8H
     *
     * @param o38hIaqi 空气质量分指数-O3_8H
     */
    public void setO38hIaqi(Short o38hIaqi) {
        this.o38hIaqi = o38hIaqi;
    }

    /**
     * 获取空气质量分指数-PM2_5_1H
     *
     * @return pm25_1h_iaqi - 空气质量分指数-PM2_5_1H
     */
    public Short getPm251hIaqi() {
        return pm251hIaqi;
    }

    /**
     * 设置空气质量分指数-PM2_5_1H
     *
     * @param pm251hIaqi 空气质量分指数-PM2_5_1H
     */
    public void setPm251hIaqi(Short pm251hIaqi) {
        this.pm251hIaqi = pm251hIaqi;
    }

    /**
     * 获取空气质量级别
     *
     * @return quality - 空气质量级别
     */
    public String getQuality() {
        return quality;
    }

    /**
     * 设置空气质量级别
     *
     * @param quality 空气质量级别
     */
    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
    }

    /**
     * 获取注意污染物
     *
     * @return primary - 注意污染物
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * 设置注意污染物
     *
     * @param primary 注意污染物
     */
    public void setPrimary(String primary) {
        this.primary = primary == null ? null : primary.trim();
    }

    /**
     * 获取评价信息
     *
     * @return msg - 评价信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置评价信息
     *
     * @param msg 评价信息
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    /**
     * 获取SO2最近1小时均值，单位微克/立方米
     *
     * @return so2_1h - SO2最近1小时均值，单位微克/立方米
     */
    public Short getSo21h() {
        return so21h;
    }

    /**
     * 设置SO2最近1小时均值，单位微克/立方米
     *
     * @param so21h SO2最近1小时均值，单位微克/立方米
     */
    public void setSo21h(Short so21h) {
        this.so21h = so21h;
    }

    /**
     * 获取最近24小时均值，单位微克/立方米
     *
     * @return so2_24h - 最近24小时均值，单位微克/立方米
     */
    public Short getSo224h() {
        return so224h;
    }

    /**
     * 设置最近24小时均值，单位微克/立方米
     *
     * @param so224h 最近24小时均值，单位微克/立方米
     */
    public void setSo224h(Short so224h) {
        this.so224h = so224h;
    }

    /**
     * 获取NO2最近1小时均值，单位微克/立方米
     *
     * @return no2_1h - NO2最近1小时均值，单位微克/立方米
     */
    public Short getNo21h() {
        return no21h;
    }

    /**
     * 设置NO2最近1小时均值，单位微克/立方米
     *
     * @param no21h NO2最近1小时均值，单位微克/立方米
     */
    public void setNo21h(Short no21h) {
        this.no21h = no21h;
    }

    /**
     * 获取NO2最近24小时均值，单位微克/立方米
     *
     * @return no2_24h - NO2最近24小时均值，单位微克/立方米
     */
    public Short getNo224h() {
        return no224h;
    }

    /**
     * 设置NO2最近24小时均值，单位微克/立方米
     *
     * @param no224h NO2最近24小时均值，单位微克/立方米
     */
    public void setNo224h(Short no224h) {
        this.no224h = no224h;
    }

    /**
     * 获取PM10最近1小时均值，单位微克/立方米
     *
     * @return pm10_1h - PM10最近1小时均值，单位微克/立方米
     */
    public Short getPm101h() {
        return pm101h;
    }

    /**
     * 设置PM10最近1小时均值，单位微克/立方米
     *
     * @param pm101h PM10最近1小时均值，单位微克/立方米
     */
    public void setPm101h(Short pm101h) {
        this.pm101h = pm101h;
    }

    /**
     * 获取PM10最近24小时均值，单位微克/立方米
     *
     * @return pm10_24h - PM10最近24小时均值，单位微克/立方米
     */
    public Short getPm1024h() {
        return pm1024h;
    }

    /**
     * 设置PM10最近24小时均值，单位微克/立方米
     *
     * @param pm1024h PM10最近24小时均值，单位微克/立方米
     */
    public void setPm1024h(Short pm1024h) {
        this.pm1024h = pm1024h;
    }

    /**
     * 获取CO最近1小时均值，毫克/立方米
     *
     * @return co_1h - CO最近1小时均值，毫克/立方米
     */
    public BigDecimal getCo1h() {
        return co1h;
    }

    /**
     * 设置CO最近1小时均值，毫克/立方米
     *
     * @param co1h CO最近1小时均值，毫克/立方米
     */
    public void setCo1h(BigDecimal co1h) {
        this.co1h = co1h;
    }

    /**
     * 获取CO最近24小时均值，毫克/立方米
     *
     * @return co_24h - CO最近24小时均值，毫克/立方米
     */
    public BigDecimal getCo24h() {
        return co24h;
    }

    /**
     * 设置CO最近24小时均值，毫克/立方米
     *
     * @param co24h CO最近24小时均值，毫克/立方米
     */
    public void setCo24h(BigDecimal co24h) {
        this.co24h = co24h;
    }

    /**
     * 获取O3最近1小时均值，单位微克/立方米
     *
     * @return o3_1h - O3最近1小时均值，单位微克/立方米
     */
    public Short getO31h() {
        return o31h;
    }

    /**
     * 设置O3最近1小时均值，单位微克/立方米
     *
     * @param o31h O3最近1小时均值，单位微克/立方米
     */
    public void setO31h(Short o31h) {
        this.o31h = o31h;
    }

    /**
     * 获取O3最近24小时均值，单位微克/立方米
     *
     * @return o3_1h_24h - O3最近24小时均值，单位微克/立方米
     */
    public Short getO31h24h() {
        return o31h24h;
    }

    /**
     * 设置O3最近24小时均值，单位微克/立方米
     *
     * @param o31h24h O3最近24小时均值，单位微克/立方米
     */
    public void setO31h24h(Short o31h24h) {
        this.o31h24h = o31h24h;
    }

    /**
     * 获取O3最近8小时滑动平均值，单位微克/立方米
     *
     * @return o3_8h - O3最近8小时滑动平均值，单位微克/立方米
     */
    public Short getO38h() {
        return o38h;
    }

    /**
     * 设置O3最近8小时滑动平均值，单位微克/立方米
     *
     * @param o38h O3最近8小时滑动平均值，单位微克/立方米
     */
    public void setO38h(Short o38h) {
        this.o38h = o38h;
    }

    /**
     * 获取O3日最近24小时的最大8小时滑动平均值，单位微克/立方米
     *
     * @return o3_8h_24h - O3日最近24小时的最大8小时滑动平均值，单位微克/立方米
     */
    public Short getO38h24h() {
        return o38h24h;
    }

    /**
     * 设置O3日最近24小时的最大8小时滑动平均值，单位微克/立方米
     *
     * @param o38h24h O3日最近24小时的最大8小时滑动平均值，单位微克/立方米
     */
    public void setO38h24h(Short o38h24h) {
        this.o38h24h = o38h24h;
    }

    /**
     * 获取PM2最近1小时均值，单位微克/立方米
     *
     * @return pm25_1h - PM2最近1小时均值，单位微克/立方米
     */
    public Short getPm251h() {
        return pm251h;
    }

    /**
     * 设置PM2最近1小时均值，单位微克/立方米
     *
     * @param pm251h PM2最近1小时均值，单位微克/立方米
     */
    public void setPm251h(Short pm251h) {
        this.pm251h = pm251h;
    }

    /**
     * 获取PM2最近24小时均值，单位微克/立方米
     *
     * @return pm25_24h - PM2最近24小时均值，单位微克/立方米
     */
    public Short getPm2524h() {
        return pm2524h;
    }

    /**
     * 设置PM2最近24小时均值，单位微克/立方米
     *
     * @param pm2524h PM2最近24小时均值，单位微克/立方米
     */
    public void setPm2524h(Short pm2524h) {
        this.pm2524h = pm2524h;
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
        sb.append(", dwname=").append(dwname);
        sb.append(", aqiUpdateTime=").append(aqiUpdateTime);
        sb.append(", aqi=").append(aqi);
        sb.append(", so21hIaqi=").append(so21hIaqi);
        sb.append(", no21hIaqi=").append(no21hIaqi);
        sb.append(", pm101hIaqi=").append(pm101hIaqi);
        sb.append(", co1hIaqi=").append(co1hIaqi);
        sb.append(", o31hIaqi=").append(o31hIaqi);
        sb.append(", o38hIaqi=").append(o38hIaqi);
        sb.append(", pm251hIaqi=").append(pm251hIaqi);
        sb.append(", quality=").append(quality);
        sb.append(", primary=").append(primary);
        sb.append(", msg=").append(msg);
        sb.append(", so21h=").append(so21h);
        sb.append(", so224h=").append(so224h);
        sb.append(", no21h=").append(no21h);
        sb.append(", no224h=").append(no224h);
        sb.append(", pm101h=").append(pm101h);
        sb.append(", pm1024h=").append(pm1024h);
        sb.append(", co1h=").append(co1h);
        sb.append(", co24h=").append(co24h);
        sb.append(", o31h=").append(o31h);
        sb.append(", o31h24h=").append(o31h24h);
        sb.append(", o38h=").append(o38h);
        sb.append(", o38h24h=").append(o38h24h);
        sb.append(", pm251h=").append(pm251h);
        sb.append(", pm2524h=").append(pm2524h);
        sb.append(", lmhCreate=").append(lmhCreate);
        sb.append(", lmhModified=").append(lmhModified);
        sb.append("]");
        return sb.toString();
    }
}