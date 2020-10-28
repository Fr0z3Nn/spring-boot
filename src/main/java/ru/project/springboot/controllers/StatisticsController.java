package ru.project.springboot.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.project.springboot.models.User;
import ru.project.springboot.repositories.UserRepository;
import ru.project.springboot.services.UserService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Контроллер статистики
 *  @author Sergey Ivanov
 */
@Controller
@RequiredArgsConstructor
public class StatisticsController {

    /**
     * Сервис пользователей, предоставляющий непосредственный доступ к репозиторию.
     */
    private final UserService userService;

    /**
     * Метод для отображения списка всех пользователей.(С помощью фримаркера
     * отображаются их данные и количество написанных статей)
     * @param model модель для добавления атрибутов на нее и дальнейшей передачи
     * @return возвращает шаблонную страницу ftl с добавленной моделью,
     *  отображение статистики пользователей.
     */
    @GetMapping("/statistics")
    public String showStatistics(Model model){
        List<User> userList = userService.getAllUsers();
        model.addAttribute("userList", userList);
        return "statistics";
    }
}
