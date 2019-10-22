package com.coolweather.coolweather.database;


import org.litepal.crud.DataSupport;

/**
 * <pre>
 *     author : 孟东风
 *     time   : 2019/10/22
 *     project_name  :CoolWeather2
 *     desc   :
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
