package com.laioffer.staybooking.model;

public class Token {
    private final String token;

    //change token to json string
    public Token(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}