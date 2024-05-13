package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Table(name = "users")
@Entity
@ToString
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String job;
}
