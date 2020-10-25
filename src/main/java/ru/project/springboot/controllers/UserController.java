package ru.project.springboot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.project.springboot.DTO.UserDTO;
import ru.project.springboot.mappers.UserMapper;
import ru.project.springboot.models.User;
import ru.project.springboot.services.UserService;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public String showUsers() {
        return "Здесь будут пользователи все";
    }

    @GetMapping("/users/{id}")
    public UserDTO showUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        return UserMapper.INSTANCE.toDTO(user);
    }
}
