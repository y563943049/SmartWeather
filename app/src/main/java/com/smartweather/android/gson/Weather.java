package com.smartweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @version 1
 * @anthor cyuan
 * @dsc weather
 * @updateAuthor $Author
 * @updateDsc ${TOOD}
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
