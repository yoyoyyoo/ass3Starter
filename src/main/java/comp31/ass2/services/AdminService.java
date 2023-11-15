package comp31.ass2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import comp31.ass2.model.entity.Employee;
import comp31.ass2.repos.EmployeeRepo;

@Service
public class AdminService {
   EmployeeRepo employeeRepo; //inject through constructor

  public AdminService(EmployeeRepo employeeRepo) {
    this.employeeRepo = employeeRepo;
  }

  public List<Employee> findAllEmployees(){
    return employeeRepo.findAll(); //call it from repo, controller will call service and the service will call the repo, separate the layers
  }

}
