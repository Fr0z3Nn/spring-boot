package ru.project.springboot.servicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.project.springboot.models.Article;
import ru.project.springboot.models.User;
import ru.project.springboot.repositories.ArticleRepository;
import ru.project.springboot.services.ArticleService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;
    @Override
    public List<Article> getAllArticles() {
        return (List<Article>) articleRepository.findAll();
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.getById(id);
    }

}
