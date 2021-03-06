package ru.project.springboot.servicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.project.springboot.models.Article;
import ru.project.springboot.models.User;
import ru.project.springboot.repositories.UserRepository;
import ru.project.springboot.services.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findUsersByIdIsNotNull();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

}
