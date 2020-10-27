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

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Controller
@RequiredArgsConstructor
public class StartController {
    private final ArticleService articleService;
    @GetMapping("/start")
    public String startPage(Model model){
        Map<String,String> mapOfArticles = articleService.getAllArticles()
                .stream()
                .limit(3)
                .collect(Collectors.toMap(Article::getName, Article::getShortText));
        model.addAttribute("articleMap",mapOfArticles);
        return "/start";
    }
}
