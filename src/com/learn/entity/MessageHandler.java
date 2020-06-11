package com.learn.entity;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class MessageSequence implements Comparator<Message> {
    @Override
    public int compare(Message m1, Message m2) {
        if(m1.getCreatedAt() < m2.getCreatedAt()) {
            return -1;
        }
        else if(m1.getCreatedAt() > m2.getCreatedAt()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
public class MessageHandler {
    private PriorityQueue<Message>messageQueue;
    private Map<Integer,User>userMapping;

    public MessageHandler() {
        messageQueue = new PriorityQueue<>(new MessageSequence());
        userMapping = new HashMap<Integer, User>();
    }

    public void registerUser(User user) {
        userMapping.put(user.getUserId(),user);
    }
    public void receiveMessage(Message message) {
        messageQueue.add(message);
    }
    public void processMessage() {
        while(messageQueue.isEmpty() == false) {
            Message message = messageQueue.poll();
            User sender = userMapping.get(message.getSenderId());
            User receiver = userMapping.get(message.getReceiverId());
            if(receiver == null) {
                System.out.println("This message can not be delivered!!!!!!! Error!!!!!");
            }
            else {
                receiver.displayMessage(sender.getUserName(),message.getContent());
            }
        }
        System.out.println("Messages delivered successfully!!");
    }
}
