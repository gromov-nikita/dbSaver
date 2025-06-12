package com.gromov.dbsaver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String mail;
    private LocalDate startWorkDate;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Assignment> assignments;
}
