package com.lmh.aqishow.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "aqi_waqi_info")
public class AqiWaqiInfo implements Serializable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 监测站代号
     */
    @Column(name = "station_idx")
    private String stationIdx;

    /**
     * 空气质量指数
     */
    private BigDecimal aqi;

    /**
     * 官方数据更新时间
     */
    @Column(name = "aqi_update_time")
    private Date aqiUpdateTime;

    /**
     * 主要污染物
     */
    private String dominentpol;

    /**
     * 空气质量分指数——pm2.5
     */
    private BigDecimal pm25;

    /**
     * 空气质量分指数——pm10
     */
    private BigDecimal pm10;

    /**
     * 空气质量分指数——o3
     */
    private BigDecimal o3;

    /**
     * 空气质量分指数——no2
     */
    private BigDecimal no2;

    /**
     * 空气质量分指数——so2
     */
    private BigDecimal so2;

    /**
     * 空气质量分指数——co
     */
    private BigDecimal co;

    /**
     * 温度——t
     */
    private BigDecimal t;

    /**
     * 大气压——p
     */
    private BigDecimal p;

    /**
     * 湿度——h
     */
    private BigDecimal h;

    /**
     * 风速——w
     */
    private BigDecimal w;

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
     * 获取监测站代号
     *
     * @return station_idx - 监测站代号
     */
    public String getStationIdx() {
        return stationIdx;
    }

    /**
     * 设置监测站代号
     *
     * @param stationIdx 监测站代号
     */
    public void setStationIdx(String stationIdx) {
        this.stationIdx = stationIdx == null ? null : stationIdx.trim();
    }

    /**
     * 获取空气质量指数
     *
     * @return aqi - 空气质量指数
     */
    public BigDecimal getAqi() {
        return aqi;
    }

    /**
     * 设置空气质量指数
     *
     * @param aqi 空气质量指数
     */
    public void setAqi(BigDecimal aqi) {
        this.aqi = aqi;
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
     * 获取主要污染物
     *
     * @return dominentpol - 主要污染物
     */
    public String getDominentpol() {
        return dominentpol;
    }

    /**
     * 设置主要污染物
     *
     * @param dominentpol 主要污染物
     */
    public void setDominentpol(String dominentpol) {
        this.dominentpol = dominentpol == null ? null : dominentpol.trim();
    }

    /**
     * 获取空气质量分指数——pm2.5
     *
     * @return pm25 - 空气质量分指数——pm2.5
     */
    public BigDecimal getPm25() {
        return pm25;
    }

    /**
     * 设置空气质量分指数——pm2.5
     *
     * @param pm25 空气质量分指数——pm2.5
     */
    public void setPm25(BigDecimal pm25) {
        this.pm25 = pm25;
    }

    /**
     * 获取空气质量分指数——pm10
     *
     * @return pm10 - 空气质量分指数——pm10
     */
    public BigDecimal getPm10() {
        return pm10;
    }

    /**
     * 设置空气质量分指数——pm10
     *
     * @param pm10 空气质量分指数——pm10
     */
    public void setPm10(BigDecimal pm10) {
        this.pm10 = pm10;
    }

    /**
     * 获取空气质量分指数——o3
     *
     * @return o3 - 空气质量分指数——o3
     */
    public BigDecimal getO3() {
        return o3;
    }

    /**
     * 设置空气质量分指数——o3
     *
     * @param o3 空气质量分指数——o3
     */
    public void setO3(BigDecimal o3) {
        this.o3 = o3;
    }

    /**
     * 获取空气质量分指数——no2
     *
     * @return no2 - 空气质量分指数——no2
     */
    public BigDecimal getNo2() {
        return no2;
    }

    /**
     * 设置空气质量分指数——no2
     *
     * @param no2 空气质量分指数——no2
     */
    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    /**
     * 获取空气质量分指数——so2
     *
     * @return so2 - 空气质量分指数——so2
     */
    public BigDecimal getSo2() {
        return so2;
    }

    /**
     * 设置空气质量分指数——so2
     *
     * @param so2 空气质量分指数——so2
     */
    public void setSo2(BigDecimal so2) {
        this.so2 = so2;
    }

    /**
     * 获取空气质量分指数——co
     *
     * @return co - 空气质量分指数——co
     */
    public BigDecimal getCo() {
        return co;
    }

    /**
     * 设置空气质量分指数——co
     *
     * @param co 空气质量分指数——co
     */
    public void setCo(BigDecimal co) {
        this.co = co;
    }

    /**
     * 获取温度——t
     *
     * @return t - 温度——t
     */
    public BigDecimal getT() {
        return t;
    }

    /**
     * 设置温度——t
     *
     * @param t 温度——t
     */
    public void setT(BigDecimal t) {
        this.t = t;
    }

    /**
     * 获取大气压——p
     *
     * @return p - 大气压——p
     */
    public BigDecimal getP() {
        return p;
    }

    /**
     * 设置大气压——p
     *
     * @param p 大气压——p
     */
    public void setP(BigDecimal p) {
        this.p = p;
    }

    /**
     * 获取湿度——h
     *
     * @return h - 湿度——h
     */
    public BigDecimal getH() {
        return h;
    }

    /**
     * 设置湿度——h
     *
     * @param h 湿度——h
     */
    public void setH(BigDecimal h) {
        this.h = h;
    }

    /**
     * 获取风速——w
     *
     * @return w - 风速——w
     */
    public BigDecimal getW() {
        return w;
    }

    /**
     * 设置风速——w
     *
     * @param w 风速——w
     */
    public void setW(BigDecimal w) {
        this.w = w;
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
        sb.append(", stationIdx=").append(stationIdx);
        sb.append(", aqi=").append(aqi);
        sb.append(", aqiUpdateTime=").append(aqiUpdateTime);
        sb.append(", dominentpol=").append(dominentpol);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", o3=").append(o3);
        sb.append(", no2=").append(no2);
        sb.append(", so2=").append(so2);
        sb.append(", co=").append(co);
        sb.append(", t=").append(t);
        sb.append(", p=").append(p);
        sb.append(", h=").append(h);
        sb.append(", w=").append(w);
        sb.append(", lmhCreate=").append(lmhCreate);
        sb.append(", lmhModified=").append(lmhModified);
        sb.append("]");
        return sb.toString();
    }
}