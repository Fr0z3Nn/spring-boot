package ru.project.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.project.springboot.models.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    Article getById(Long id);
}
