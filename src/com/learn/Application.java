package com.learn;

import com.learn.entity.Message;
import com.learn.entity.MessageHandler;
import com.learn.entity.User;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        User user1 = new User("anuj");
        messageHandler.registerUser(user1);
        User user2 = new User("sanjay");
        messageHandler.registerUser(user2);
        User user3 = new User("aashi");
        messageHandler.registerUser(user3);

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] messageList = new String[N];
        for(int i = 0;i < N;i++) {
            messageList[i] = in.nextLine();
        }
        int senderId = 5;
        for(int i = 0;i < N;i++) {
            Message message = new Message(senderId%3 +1,senderId%2 + 1,messageList[i]);
            messageHandler.receiveMessage(message);
            senderId++;
        }
        messageHandler.processMessage();
    }
}
