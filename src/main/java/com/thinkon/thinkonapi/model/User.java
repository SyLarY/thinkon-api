package com.thinkon.thinkonapi.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name="users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
