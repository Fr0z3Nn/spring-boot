package ru.project.springboot.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.project.springboot.models.User;
import ru.project.springboot.repositories.UserRepository;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
