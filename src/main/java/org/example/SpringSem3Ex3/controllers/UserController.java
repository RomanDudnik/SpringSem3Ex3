package org.example.SpringSem3Ex3.controllers;

import org.example.SpringSem3Ex3.domain.User;
import org.example.SpringSem3Ex3.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> userList() { return service.getDataProcessingService().getRepository().getUsers(); }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user)
    {
        service.getDataProcessingService().getRepository().getUsers().add(user);
        return "User added from body!";
    }

    /**
     * Задание со звездочкой
     * 	 1) В классе UserController добавить обработчик userAddFromParam извлекающий данные для создания пользователя
     * 	 из параметров HTTP запроса
     */

    @PostMapping("/param")
    public String userAddFromParam(@RequestParam String name, @RequestParam int age)
    {
        User user = new User();
        service.getDataProcessingService().getRepository().getUsers().add(user);
        return "User added from param!";
    }

//    /**
//     * 2) Перенести репозиторий проекта с List<User> на базу данных H2
//     */
//
//
//
//    @PostMapping("/db")
//    public String userAddFromDB(@RequestParam String name, @RequestParam int age)
//    {
//        User user = new User();
//        service.getDataProcessingService().getRepository().getUsers().add(user);
//        return "User added from db!";
//    }

}
