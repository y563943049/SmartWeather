package com.smartweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @version 1
 * @anthor cyuan
 * @dsc county
 * @updateAuthor cyuan
 * @updateDsc nothing
 */
public class County extends DataSupport {
    //县的编号
    private int id;
    //县的名称
    private String countyName;
    //县的天气id
    private String weatherId;
    //县的市
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

}
