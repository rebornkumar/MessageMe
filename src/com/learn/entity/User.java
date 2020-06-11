package com.learn.entity;

public class User {
    private static int id = 1;
    private int userId;
    private String userName;

    public User(String userName) {
        this.userId = id++;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void displayMessage(String senderName,String content) {
        System.out.println("SenderName : " + senderName + ", message : " + content + " receiverName + " + this.userName);
    }
}
