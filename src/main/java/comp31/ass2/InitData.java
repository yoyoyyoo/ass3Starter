package comp31.ass2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import comp31.ass2.model.entity.Employee;
import comp31.ass2.model.entity.PetOwner;
import comp31.ass2.model.entity.Pets;
import comp31.ass2.repos.EmployeeRepo;
import comp31.ass2.repos.PetOwnerRepo;
import comp31.ass2.repos.PetsRepo;

@Component
public class InitData implements CommandLineRunner { 

    EmployeeRepo employeeRepo;
    PetsRepo petsRepo;
    PetOwnerRepo petOwnerRepo;
    
    
// scource action-> generate contructor
public InitData(EmployeeRepo employeeRepo, PetsRepo petsRepo, PetOwnerRepo petOwnerRepo) {
        this.employeeRepo = employeeRepo;
        this.petsRepo = petsRepo;
        this.petOwnerRepo = petOwnerRepo;
    }

     @Override
    public void run(String... args) throws Exception {
        Employee emp1=new Employee("anderson", "Anderson", "Abbie","anderson","office");
        Employee emp2=new Employee("sam", "Sam", "Smith", "sam","manager");
        Employee emp3=new Employee("olivia", "Olivia", "Olson","olivia","office");
      
        employeeRepo.save(emp1);
        employeeRepo.save(emp2);
        employeeRepo.save(emp3);
        
        PetOwner owner1 = new PetOwner("ashly", "Ashly", "Black", "123", "approved", "ash@fake.com", false);
        PetOwner owner2 = new PetOwner("bill", "Bill", "Jack", "abc", "submitted", "bill@fake.com", true);
        PetOwner owner3 = new PetOwner("lily", "Lily", "Smith", "234", "declined", "lil@fake.com", false);
        PetOwner owner4 = new PetOwner("cathy", "Cathy", "White", "123", "approved", "cathy@fake.com", false);
        PetOwner owner5 = new PetOwner("dale", "Dale", "Bill", "abc", "submitted", "dale@fake.com", true);
        PetOwner owner6 = new PetOwner("phil", "Phil", "T", "234", "declined", "phil@fake.com", false);

        petOwnerRepo.save(owner1);
        petOwnerRepo.save(owner2);
        petOwnerRepo.save(owner3);
        petOwnerRepo.save(owner4);
        petOwnerRepo.save(owner5);
        petOwnerRepo.save(owner6);


        Pets pet1=new Pets("panC","Pan Cake", "Cat","Black", "Small",owner1,emp1,"pending");
        Pets pet2=new Pets("Gri","Grizzly ", "Dog","Brown", "Large", owner2,emp2, "waiting");
        Pets pet3=new Pets("Mus","Mushroom", "Cat","Yellow", "Medium ", owner3,emp3,"waiting");
        Pets pet4=new Pets("Fur", "Fur", "Dog","White", "Large ", owner4, emp1,"adopted");
        Pets pet5=new Pets("Pep","Pepper", "Cat","Black", "Small",owner5,emp1,"pending");
        Pets pet6=new Pets("Oll ","Ollie ", "Dog","Brown", "Large", owner6,emp2, "pending");
        Pets pet7=new Pets("Man","Mango", "Cat","Yellow", "Medium ", owner3,emp3,"waiting");
        Pets pet8=new Pets("Cia","Ciao", "Dog","White", "Large ", owner3, emp1,"pending");

        petsRepo.save(pet1);
        petsRepo.save(pet2);
        petsRepo.save(pet3);
        petsRepo.save(pet4);
        petsRepo.save(pet5);
        petsRepo.save(pet6);     
        petsRepo.save(pet7);
        petsRepo.save(pet8);       
    }
    
    
}