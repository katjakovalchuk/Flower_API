package ua.edu.ucu.apps.lab.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class AppUser {
    private int id;
    private String email;
    @Transient
    private String dob; // ?
    private int age;

    public AppUser(String email, String dob) {
        this.email = email;
        this.dob = dob;
    }

}
