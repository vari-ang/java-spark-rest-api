package com.mycompany.user;

import com.google.gson.JsonElement;

public class ResponseBody {
    private StatusResponse status;
    private String message;
    private JsonElement data;

    public ResponseBody(StatusResponse status) {
        this.status = status;
    }

    public ResponseBody(StatusResponse status, JsonElement data) {
        this.status = status;
        this.data = data;
    }
}
