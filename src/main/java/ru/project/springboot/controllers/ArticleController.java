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

/**
 * Контроллер Статей, котороый позволяет взаимодействовать с ними,
 * осуществлять поиск, добавление и тд, с дальнейшей передачей на фронт.
 *  @author Sergey Ivanov
 */
@Controller
@RequiredArgsConstructor
public class ArticleController {

    /**
     * Сервис статей, предоставляющий непосредственный доступ к репозиторию.
     */
    private final ArticleService articleService;

    /**
     * Метод для поиска статьи по ид, добавлении ее в модель и передачи на фронт
     * @param model модель для добавления атрибутов на нее и дальнейшей передачи
     * @param id уникальное значение статьи, у каждой статьи своя, поиск по бд
     * @return возвращает шаблонную страницу ftl с добавленной моделью,
     * отображение статьи.
     */
    @GetMapping("/article/{id}")
    public String showUser(Model model, @PathVariable Long id) {
        Article article = articleService.getArticleById(id);
        model.addAttribute("articleOnly",article);
        return "article";
    }
}

