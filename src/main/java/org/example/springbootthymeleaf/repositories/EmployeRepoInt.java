package org.example.springbootthymeleaf.repositories;

import org.example.springbootthymeleaf.entities.Employe;

import java.util.List;

public interface EmployeRepoInt {
    List<Employe> findAllEmployees();
    static List<Employe> findAllEmployeesByEmploye(Employe employee);

  
}
