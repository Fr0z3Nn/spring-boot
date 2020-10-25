package ru.project.springboot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.project.springboot.DTO.RoleDTO;
import ru.project.springboot.DTO.UserDTO;
import ru.project.springboot.models.Role;
import ru.project.springboot.models.User;
import ru.project.springboot.services.UserService;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

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
        return toDTO(user);
    }

    private UserDTO toDTO(User user) {
        Set<RoleDTO> roleDTOS = toDTOs(user.getRoles());
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .roles(roleDTOS)
                .build();
    }

    private Set<RoleDTO> toDTOs(Set<Role> roles) {
        return roles.stream().map(this::toDTO).collect(Collectors.toSet());
    }

    private RoleDTO toDTO(Role role) {
        return RoleDTO.builder()
                .id(role.getId())
                .name(role.getName())
                .build();
    }
}
