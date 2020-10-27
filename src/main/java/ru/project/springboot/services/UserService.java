package ru.project.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.project.springboot.models.Article;
import ru.project.springboot.models.User;

import java.util.List;


public interface UserService {
    User getUser(Long id);
    List<User> getAllUsers ();
    void saveUser(User user);
}
