package com.smartweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @version 1
 * @anthor cyuan
 * @dsc gson class
 * @updateAuthor $Author
 * @updateDsc ${TOOD}
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
