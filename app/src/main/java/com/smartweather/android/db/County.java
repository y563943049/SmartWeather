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
    //县的代码
    private int countyCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }
}
