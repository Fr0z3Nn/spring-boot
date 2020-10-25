package ru.project.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.project.springboot.models.User;


public interface UserService {
    User getUser(Long id);
}
