package com.smartweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @version 1
 * @anthor cyuan
 * @dsc weather suggestion
 * @updateAuthor $Author
 * @updateDsc ${TOOD}
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
