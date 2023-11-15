package comp31.ass2.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import comp31.ass2.model.entity.Employee;
import comp31.ass2.services.AdminService;

@Controller
public class MainController {
  AdminService adminService;

    public MainController(AdminService adminService) {
      this.adminService = adminService;
    }

@GetMapping("/")
public String getRoot(){
  return "index";
}

@GetMapping("/employee")
public String getEmp(Model model){
  List<Employee> employees = adminService.findAllEmployees();
  model.addAttribute("employees", employees);
  return "employee";
}



}

