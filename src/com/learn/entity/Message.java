package com.learn.entity;

public class Message {
    private static int messageId = 0;
    private int senderId;
    private int receiverId;
    private  String content;
    private int messagePriority;

    public int getCreatedAt() {
        return messagePriority;
    }

    public Message(int senderId, int receiverId, String content) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.messagePriority = messageId++;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
