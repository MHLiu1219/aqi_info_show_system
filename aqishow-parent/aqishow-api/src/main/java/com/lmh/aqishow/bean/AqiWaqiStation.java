package com.lmh.aqishow.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "aqi_waqi_station")
public class AqiWaqiStation implements Serializable {
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
     * 中文名称
     */
    @Column(name = "station_name")
    private String stationName;

    /**
     * 监测站所在地的具体位置 —— 纬度
     */
    private BigDecimal latitude;

    /**
     * 监测站具体位置——经度
     */
    private BigDecimal longitude;

    /**
     * 监测站url路径简写，拼接到对应的有具体功能的url后面可以获取有关这个监测站的信息，比如获取该监测站附近的监测站
     */
    private String url;

    /**
     * 记录该监测站的美领馆官方详情页面跳转链接
     */
    @Column(name = "url_wqi_details")
    private String urlWqiDetails;

    /**
     * 监测站所在时区
     */
    @Column(name = "time_zone")
    private String timeZone;

    /**
     * 最后更新时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 记录该监测站官方的更新状态（仍正常更新、已暂停更新、已停止更新）
     */
    @Column(name = "update_status")
    private String updateStatus;

    /**
     * 市
     */
    private String city;

    /**
     * 省
     */
    private String province;

    /**
     * 国家
     */
    private String country;

    /**
     * 表数据新增时间
     */
    @Column(name = "lmh_create")
    private Date lmhCreate;

    /**
     * 表数据修改修改日期
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
     * 获取中文名称
     *
     * @return station_name - 中文名称
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 设置中文名称
     *
     * @param stationName 中文名称
     */
    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    /**
     * 获取监测站所在地的具体位置 —— 纬度
     *
     * @return latitude - 监测站所在地的具体位置 —— 纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置监测站所在地的具体位置 —— 纬度
     *
     * @param latitude 监测站所在地的具体位置 —— 纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取监测站具体位置——经度
     *
     * @return longitude - 监测站具体位置——经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置监测站具体位置——经度
     *
     * @param longitude 监测站具体位置——经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取监测站url路径简写，拼接到对应的有具体功能的url后面可以获取有关这个监测站的信息，比如获取该监测站附近的监测站
     *
     * @return url - 监测站url路径简写，拼接到对应的有具体功能的url后面可以获取有关这个监测站的信息，比如获取该监测站附近的监测站
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置监测站url路径简写，拼接到对应的有具体功能的url后面可以获取有关这个监测站的信息，比如获取该监测站附近的监测站
     *
     * @param url 监测站url路径简写，拼接到对应的有具体功能的url后面可以获取有关这个监测站的信息，比如获取该监测站附近的监测站
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取记录该监测站的美领馆官方详情页面跳转链接
     *
     * @return url_wqi_details - 记录该监测站的美领馆官方详情页面跳转链接
     */
    public String getUrlWqiDetails() {
        return urlWqiDetails;
    }

    /**
     * 设置记录该监测站的美领馆官方详情页面跳转链接
     *
     * @param urlWqiDetails 记录该监测站的美领馆官方详情页面跳转链接
     */
    public void setUrlWqiDetails(String urlWqiDetails) {
        this.urlWqiDetails = urlWqiDetails == null ? null : urlWqiDetails.trim();
    }

    /**
     * 获取监测站所在时区
     *
     * @return time_zone - 监测站所在时区
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 设置监测站所在时区
     *
     * @param timeZone 监测站所在时区
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    /**
     * 获取最后更新时间
     *
     * @return last_update_time - 最后更新时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdateTime 最后更新时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 获取记录该监测站官方的更新状态（仍正常更新、已暂停更新、已停止更新）
     *
     * @return update_status - 记录该监测站官方的更新状态（仍正常更新、已暂停更新、已停止更新）
     */
    public String getUpdateStatus() {
        return updateStatus;
    }

    /**
     * 设置记录该监测站官方的更新状态（仍正常更新、已暂停更新、已停止更新）
     *
     * @param updateStatus 记录该监测站官方的更新状态（仍正常更新、已暂停更新、已停止更新）
     */
    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus == null ? null : updateStatus.trim();
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
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
     * 获取表数据修改修改日期
     *
     * @return lmh_modified - 表数据修改修改日期
     */
    public Date getLmhModified() {
        return lmhModified;
    }

    /**
     * 设置表数据修改修改日期
     *
     * @param lmhModified 表数据修改修改日期
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
        sb.append(", stationName=").append(stationName);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", url=").append(url);
        sb.append(", urlWqiDetails=").append(urlWqiDetails);
        sb.append(", timeZone=").append(timeZone);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", updateStatus=").append(updateStatus);
        sb.append(", city=").append(city);
        sb.append(", province=").append(province);
        sb.append(", country=").append(country);
        sb.append(", lmhCreate=").append(lmhCreate);
        sb.append(", lmhModified=").append(lmhModified);
        sb.append("]");
        return sb.toString();
    }
}