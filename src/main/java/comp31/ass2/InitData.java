package comp31.ass2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import comp31.ass2.model.entity.Employee;
import comp31.ass2.repos.EmployeeRepo;

@Component
public class InitData implements CommandLineRunner { 

    EmployeeRepo employeeRepo;
    
// scource action-> generate contructor
public InitData(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

     @Override
    public void run(String... args) throws Exception {

        
        employeeRepo.save(new Employee("anderson", "Anderson", "Abbie"));
        employeeRepo.save(new Employee("sam", "Sam", "Smith"));
        employeeRepo.save(new Employee("olivia", "Olivia", "Olson"));
        
    }
    
}