package com.nsp.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or another generation strategy
    private Long id;
    private String empName;
    private double empSalary;
    private String emailId;
    private String password;
}
