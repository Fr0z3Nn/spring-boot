package ru.project.springboot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.project.springboot.DTO.UserDTO;
import ru.project.springboot.models.Article;
import ru.project.springboot.models.User;
import ru.project.springboot.services.ArticleService;


@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;


    @GetMapping("/article/{id}")
    public String showUser(Model model, @PathVariable Long id) {
        Article article = articleService.getArticleById(id);
        model.addAttribute("articleOnly",article);
        return "article";
    }
}

