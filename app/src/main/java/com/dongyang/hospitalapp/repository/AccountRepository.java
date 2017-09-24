package com.dongyang.hospitalapp.repository;


import com.dongyang.hospitalapp.domain.Account;
import com.dongyang.hospitalapp.domain.Response;
import com.dongyang.hospitalapp.http.HttpPostTask;
import com.dongyang.hospitalapp.http.RequestBodyFactory;
import com.dongyang.hospitalapp.utils.WsConfig;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import okhttp3.RequestBody;

public class AccountRepository implements Repository<Account, String> {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account findById(String id) {
        return null;
    }

    @Override
    public Response add(Account account) {
        return null;
    }

    @Override
    public Response update(List<Account> list) {
        return null;
    }

    @Override
    public Response update(Account account) {
        return null;
    }

    @Override
    public Response updateOrAdd(Account account) {
        return null;
    }

    @Override
    public Response delete(String id) {
        return null;
    }

    public Response login(Account account) {
        RequestBody requestBody = RequestBodyFactory.getAccount(account);
        HttpPostTask httpPostTask = new HttpPostTask(WsConfig.POST_ACCOUNT, requestBody);

        try {
            String result = httpPostTask.execute().get();

            return objectMapper.readValue(result, Response.class);
        } catch (IOException | ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }

        return new Response();
    }

}
