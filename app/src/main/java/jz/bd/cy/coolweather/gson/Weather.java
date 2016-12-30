package jz.bd.cy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * One of the server's data.
 * Created by heukeith on 2016/12/29.
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
