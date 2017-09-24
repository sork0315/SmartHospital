package com.dongyang.hospitalapp.http;

import com.dongyang.hospitalapp.domain.Account;

import okhttp3.FormBody;
import okhttp3.RequestBody;

public class RequestBodyFactory {
    public static RequestBody getAccount(Account account) {
        RequestBody requestBody = new FormBody.Builder()
                .add("ID", account.getId())
                .add("PW", account.getPassword())
                .build();

        return requestBody;
    }

}

