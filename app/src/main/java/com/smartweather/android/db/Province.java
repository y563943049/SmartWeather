package com.smartweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @version 1
 * @anthor cyuan
 * @dsc province
 * @updateAuthor cyuan
 * @updateDsc nothing
 */
public class Province extends DataSupport {
    //省的编号
    private int id;
    //省的名称
    private String provinceName;
    //省的代码
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
