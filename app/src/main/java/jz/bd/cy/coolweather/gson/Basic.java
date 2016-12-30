package jz.bd.cy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * One of the server's data.
 * Created by heukeith on 2016/12/29.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
