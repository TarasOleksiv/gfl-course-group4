package com.example.demogroup4.model;

import java.time.LocalDateTime;

public class User {

    private String userName;
    private LocalDateTime localDateTime;

    public User() {}

    public User(String userName, LocalDateTime localDateTime) {
        this.userName = userName;
        this.localDateTime = localDateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
