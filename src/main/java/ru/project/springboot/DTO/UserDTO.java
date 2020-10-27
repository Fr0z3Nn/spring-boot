package ru.project.springboot.DTO;

import lombok.*;
import ru.project.springboot.models.Article;
import ru.project.springboot.models.Role;

import java.util.List;
import java.util.Set;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    private Long id;
    private String email;
    private Set<RoleDTO> roles;
    private List<Article> articles;
}
