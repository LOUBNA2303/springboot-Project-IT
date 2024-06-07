package org.example.springbootthymeleaf.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Employe extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ElementCollection
    private List <String> skills;
    @ManyToMany
    List <Project> projects;
}
