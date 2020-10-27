package ru.project.springboot.services;

import ru.project.springboot.models.Article;
import ru.project.springboot.models.User;

import java.util.List;

public interface ArticleService {
    List<Article> getAllArticles ();
    Article getArticleById(Long id);
}
