package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Meow on 2017/7/19.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperatue temperatue;

    @SerializedName("cond")
    public More more;

    public class Temperatue {
        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
