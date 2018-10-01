package com.example.paul.socialnetwork;

public class Messages {

    public String data , time , from ,type , message;

    public Messages() {
    }

    public Messages(String data, String time, String from, String type, String message) {
        this.data = data;
        this.time = time;
        this.from = from;
        this.type = type;
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
