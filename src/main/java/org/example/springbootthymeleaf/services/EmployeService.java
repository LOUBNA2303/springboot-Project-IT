package org.example.springbootthymeleaf.services;

import org.example.springbootthymeleaf.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeService {
    @Autowired
    private EmployeRepo employeRepo;

    public List<Employe> getAllEmployees() {
        return employeRepo.findAll();
    }
}
