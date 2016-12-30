package jz.bd.cy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * One of the server's data.
 * Created by heukeith on 2016/12/29.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
