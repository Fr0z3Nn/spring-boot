package ru.project.springboot.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.project.springboot.models.Article;
import ru.project.springboot.models.User;

import java.util.List;

@Repository
                                                    // таблица  тип ид
public interface UserRepository extends CrudRepository<User, Long> {
    User getById(Long id);
    List<User> findUsersByIdIsNotNull();

}
