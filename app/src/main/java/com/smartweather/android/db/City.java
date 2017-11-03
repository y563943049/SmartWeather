package com.smartweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @version 1
 * @anthor cyuan
 * @dsc city
 * @updateAuthor cyuan
 * @updateDsc nothing
 */
public class City extends DataSupport{
    //城市编号
    private int id;
    //城市名称
    private String cityName;
    //城市代码
    private int cityCode;
    //城市的省份
    private int provinceId;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
