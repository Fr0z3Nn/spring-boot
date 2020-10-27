package ru.project.springboot.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity @Builder
@EqualsAndHashCode(of = "email")
@Table(name = "Users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    // ARTICLES
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)

    private List<Article> articleList = new ArrayList<>();

    public void addArticle(Article article) {
        articleList.add( article );
        article.setUser( this );
    }

    public void removeArticle(Article article) {
        articleList.remove( article );
        article.setUser( null );
    }

    // ROLES
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "users_id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id"))

    private Set<Role> roles = new HashSet<>();

    public void addRole(Role role) {
        roles.add(role);
        role.getUsers().add(this);
    }

    public void removeRole(Role role) {
        roles.remove(role);
        role.getUsers().remove(this);
    }
}
