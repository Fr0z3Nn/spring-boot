package ru.project.springboot.DTO;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class RoleDTO {
    private Long id;
    private String name;
}
