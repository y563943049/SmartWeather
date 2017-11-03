package com.smartweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @version 1
 * @anthor cyuan
 * @dsc daily forecast
 * @updateAuthor $Author
 * @updateDsc ${TOOD}
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;

        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
