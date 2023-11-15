package comp31.ass2.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import comp31.ass2.model.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> { 
   public List<Employee> findAll(); 
  
} 
