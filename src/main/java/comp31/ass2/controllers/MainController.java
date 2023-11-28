package comp31.ass2.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comp31.ass2.model.entity.Employee;
import comp31.ass2.model.entity.PetOwner;
import comp31.ass2.model.entity.Pets;
import comp31.ass2.services.EmployeeService;

@Controller
public class MainController {
  EmployeeService employeeService;

  public MainController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping("/")
  public String getRoot() {
    return "index";
  }

  @GetMapping("/manager")
  public String getRequest(Model model, String status,String searchEmployee, String ownerStatus) { 

    //get the status para and find the pets based on status
    model.addAttribute("status", status);
    List<Pets> filteredPets = employeeService.findByAdoptStatus(status);
    model.addAttribute("filteredPets", filteredPets);

    //get petOwner
     List<PetOwner> filteredOwner=employeeService.findOwnerByStatus(ownerStatus);
    model.addAttribute("ownerStatus", ownerStatus);
    model.addAttribute("filteredOwner", filteredOwner);

    return "manager";
  }

  @PostMapping("/approve-owner") // Post new added employee data and redirect to /employee
  public String approveOwner(String ownerId, String ownerStatus) {
    employeeService.setOwnerStatus(ownerId, ownerStatus);
    return "redirect:/manager";
  }

}
