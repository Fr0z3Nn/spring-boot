package ru.project.springboot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.project.springboot.models.User;
import ru.project.springboot.services.UserService;

import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequiredArgsConstructor
public class HelloWorldController {

    private final UserService userService;

    @GetMapping("/hello")
    public String hello(Model model) {
        createUsersList(model);
        return "hello";
    }

    @PostMapping("/hello")
    public String saveNewUser(Model model, @RequestParam String email, @RequestParam String password ) {
        userService.saveUser(User.builder().email(email).password(password).build());
        createUsersList(model);
        return "hello";
    }

    private void createUsersList(Model model) {
        List<String> usersWhoRegister = userService.getAllUsers().stream().map(User::getEmail).collect(Collectors.toList());
        model.addAttribute("usersList", usersWhoRegister);
    }

}
