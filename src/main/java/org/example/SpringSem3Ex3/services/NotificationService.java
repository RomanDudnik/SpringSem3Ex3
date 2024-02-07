package org.example.SpringSem3Ex3.services;

import org.example.SpringSem3Ex3.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("User " + user.getName() + " was notified.");
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}
