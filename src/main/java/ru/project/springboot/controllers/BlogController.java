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

/**
 * Контроллер главной страницы
 *  @author Sergey Ivanov
 */
@Controller
@RequiredArgsConstructor
public class BlogController {

    /**
     * Сервис статей, предоставляющий непосредственный доступ к репозиторию.
     */
    private final ArticleService articleService;

    /**
     * Метод для отображения главного вида стартовой страницы
     * Также для отображения осуществляется поиск статей для отображения
     * @param model модель для добавления атрибутов на нее и дальнейшей передачи
     * @return возвращает шаблонную страницу ftl с добавленной моделью,
     * отображение стартовой страницы.
     */
    @GetMapping("/blog")
    public String startPage(Model model){
        List<Article> listOfArticles = articleService.getAllArticles();
        model.addAttribute("articleList",listOfArticles);
        return "blog";
    }
}
