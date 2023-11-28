package comp31.ass2.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PetOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String userId;
    String firstName;
    String lastName;
    String password;
    String email;
    String status = "submitted";// set default when a new user register
    Boolean preference = false;
    @ManyToOne
    @JoinColumn(name = "fkey_pet")
    Pets preferredPet;



public PetOwner(String userId, String firstName, String lastName, String password, String status, String email,
    Boolean preference) {
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.email = email;
    this.status = status;
    this.preference = preference;
}

public void setStatus(String newStatus) {
    this.status = newStatus;
}

}
