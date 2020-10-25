package ru.project.springboot.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.project.springboot.models.User;

@Repository
                                                    // таблица  тип ид
public interface UserRepository extends CrudRepository<User, Long> {
}
