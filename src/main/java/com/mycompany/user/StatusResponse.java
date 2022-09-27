package com.mycompany.user;

public enum StatusResponse {
    SUCCESS("Success"),
    ERROR("Error");

    private String status;

    private StatusResponse(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.status;
    }
}
