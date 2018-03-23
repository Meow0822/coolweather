package com.coolweather.android.gson;

/**
 * Created by Meow on 2017/7/19.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
