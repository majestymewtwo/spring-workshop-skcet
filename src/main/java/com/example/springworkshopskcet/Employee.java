package com.example.springworkshopskcet;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private Long id;
    @Column(name = "empName")
    private String name;
    @Column(name = "empDepartment")
    private String department;
}
