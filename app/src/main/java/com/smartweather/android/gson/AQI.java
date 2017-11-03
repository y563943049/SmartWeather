package com.smartweather.android.gson;

/**
 * @version 1
 * @anthor cyuan
 * @dsc AQI
 * @updateAuthor $Author
 * @updateDsc ${TOOD}
 */
public class AQI {

    public AQIcity city;

    public class AQIcity{
        public String aqi;
        public String pm25;
    }
}
