package ru.project.springboot.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.project.springboot.models.Article;
import ru.project.springboot.models.User;
import ru.project.springboot.services.ArticleService;
import ru.project.springboot.services.UserService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Controller
@RequiredArgsConstructor
public class BlogController {
    private final ArticleService articleService;
    private final UserService userService;
    @GetMapping("/blog")
    public String startPage(Model model){
        List<Article> listOfArticles = articleService.getAllArticles();
        model.addAttribute("articleList",listOfArticles);
        return "blog";
    }
}
