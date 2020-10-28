package ru.project.springboot.models;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity @Builder
@EqualsAndHashCode(of = "name")
@Table(name = "Article")

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String shortText;
    private String text;
    private String dateOfCreate;

    @ManyToOne
    private User user;

}

