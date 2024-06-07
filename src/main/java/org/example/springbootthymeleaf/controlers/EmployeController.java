package org.example.springbootthymeleaf.controlers;

import org.example.springbootthymeleaf.entities.Employe;
import org.example.springbootthymeleaf.repositories.EmployeRepoInt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;
@Controller
public class EmployeController {
    private EmployeRepoInt employeRepo;
    @GetMapping(path = "/index")
    public String Employees(Model model) {
        List<Employe> employees = EmployeRepoInt.findAllEmployeesByEmploye((Employe) employeRepo);
        model.addAttribute("listemployees", employees);
        return "employees";
    }
}
