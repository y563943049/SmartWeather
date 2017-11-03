package com.smartweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @version 1
 * @anthor cyuan
 * @dsc sendHttp
 * @updateAuthor $Author
 * @updateDsc ${TOOD}
 */
public class HttpUtil {

    /**通过okhttp发送http请求，回调机制处理服务器的响应*/
    public static void sendOkhttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
