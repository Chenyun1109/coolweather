package jz.bd.cy.coolweather.gson;

/**
 * One of the server's data.
 * Created by heukeith on 2016/12/29.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }
}
