package comp31.ass2.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
// @Table(name="Employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;//for database, primary key, diff from userID
  String userId;
  String firstName;
  String lastName;
  String password;

  public Employee(String userId, String firstName, String lastName) {
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
  }    
}
