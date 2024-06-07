package org.example.springbootthymeleaf.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double budget;

    @ManyToMany
    List<Employe> employees;
}
