package org.example.SpringSem3Ex3.services;

import org.example.SpringSem3Ex3.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private NotificationService notificationService;

//    public UserService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);

        // Отправка уведомления о создании нового пользователя
        notificationService.notifyUser(user);

        return user;
    }

}
