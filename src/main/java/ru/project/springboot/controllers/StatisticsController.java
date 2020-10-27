package ru.project.springboot.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.project.springboot.models.User;
import ru.project.springboot.repositories.UserRepository;
import ru.project.springboot.services.UserService;

import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequiredArgsConstructor
public class StatisticsController {
    private final UserService userService;
    @GetMapping("/statistics")
    public String showStatistics(Model model){
        List<User> userList = userService.getAllUsers();
        model.addAttribute("userList", userList);
        return "statistics";
    }
}
