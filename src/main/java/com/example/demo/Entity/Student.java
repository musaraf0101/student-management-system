package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity // mention this is a entity class
@Table(name = "student") //create table name without creation it's take class name as a table name
public class Student {
    @Id //mention id is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Long id;
    //@Column(name = "fullname", length=255, nullable = false ) //set properties
    private String name;
    private String nic;
    private int age;
}
