package jz.bd.cy.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * The network util.
 * Created by heukeith on 2016/12/29.
 */

public class HttpUtil {

    public static void sendRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
