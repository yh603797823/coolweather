package com.example.yuhui.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yuhui on 17-2-24.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private int cityId;
    private String wetherId;

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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWetherId() {
        return wetherId;
    }

    public void setWetherId(String wetherId) {
        this.wetherId = wetherId;
    }
}
