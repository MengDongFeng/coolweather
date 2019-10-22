package com.coolweather.coolweather.database;

import org.litepal.crud.DataSupport;

/**
 * <pre>
 *     author : 孟东风
 *     time   : 2019/10/22
 *     project_name  :CoolWeather2
 *     desc   :
 */
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getcityName(){
        return cityName;
    }
    public void setcityName(String cityName){
        this.cityName=cityName;
    }
    public int getcityCode(){
        return cityCode;
    }
    public void setcityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
