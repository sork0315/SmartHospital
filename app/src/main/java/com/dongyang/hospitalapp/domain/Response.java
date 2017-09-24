package com.dongyang.hospitalapp.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty("msg")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
