package jz.bd.cy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * One of the server's data.
 * Created by heukeith on 2016/12/29.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

}
