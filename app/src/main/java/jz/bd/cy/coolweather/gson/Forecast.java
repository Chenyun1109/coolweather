package jz.bd.cy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * One of the server's data.
 * Created by heukeith on 2016/12/29.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}
