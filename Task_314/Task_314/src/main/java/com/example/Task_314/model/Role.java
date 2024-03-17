package com.example.Task_314.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

@Entity
@Table(name = "roles", uniqueConstraints = @UniqueConstraint(columnNames = {"role"}))
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role")
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> userSet;

    public Role() {
    }

    @Override
    public String toString() {
        return getName().substring(getName().indexOf('_') + 1);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public Role(String name) {
        this.name = name;
    }

    public Role(String name, Set<User> userSet) {
        this.name = name;
        this.userSet = userSet;}

    @Override
    public String getAuthority() {
        return name;
    }
}
