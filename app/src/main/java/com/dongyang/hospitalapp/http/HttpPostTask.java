package com.dongyang.hospitalapp.http;


import android.os.AsyncTask;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpPostTask extends AsyncTask<Void, Void, String> {

    private String url;
    private RequestBody requestBody;

    public HttpPostTask(String url, RequestBody requestBody) {
        this.url = url;
        this.requestBody = requestBody;
    }

    @Override
    protected String doInBackground(Void... voids) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        builder.url(url).post(requestBody);

        Request request = builder.build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                String result = response.body().toString();
                response.body().close();
                return result;
            }

            response.body().close();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
