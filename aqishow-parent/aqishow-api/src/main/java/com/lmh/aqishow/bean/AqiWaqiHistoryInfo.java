package com.lmh.aqishow.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "aqi_waqi_history_info")
public class AqiWaqiHistoryInfo implements Serializable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 地点（城市）
     */
    private String site;

    /**
     * 空气质量成员（pm2.5）
     */
    private String parameter;

    /**
     * 记录时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 具体值
     */
    @Column(name = "his_value")
    private Short hisValue;

    /**
     * 单位
     */
    private String unit;

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
     * 获取地点（城市）
     *
     * @return site - 地点（城市）
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置地点（城市）
     *
     * @param site 地点（城市）
     */
    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    /**
     * 获取空气质量成员（pm2.5）
     *
     * @return parameter - 空气质量成员（pm2.5）
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * 设置空气质量成员（pm2.5）
     *
     * @param parameter 空气质量成员（pm2.5）
     */
    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    /**
     * 获取记录时间
     *
     * @return update_time - 记录时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置记录时间
     *
     * @param updateTime 记录时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取具体值
     *
     * @return his_value - 具体值
     */
    public Short getHisValue() {
        return hisValue;
    }

    /**
     * 设置具体值
     *
     * @param hisValue 具体值
     */
    public void setHisValue(Short hisValue) {
        this.hisValue = hisValue;
    }

    /**
     * 获取单位
     *
     * @return unit - 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位
     *
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", site=").append(site);
        sb.append(", parameter=").append(parameter);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", hisValue=").append(hisValue);
        sb.append(", unit=").append(unit);
        sb.append("]");
        return sb.toString();
    }
}