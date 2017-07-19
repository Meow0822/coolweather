package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Meow on 2017/7/19.
 */

public class Province extends DataSupport {
    private int id;

    private int provinceCode;

    private int provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(int provinceName) {
        this.provinceName = provinceName;
    }
}
