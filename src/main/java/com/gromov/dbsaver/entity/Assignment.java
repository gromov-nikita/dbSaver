package com.gromov.dbsaver.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gromov.dbsaver.service.LocalDateJsonDeserializer;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;
    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;
    @JsonDeserialize(using = LocalDateJsonDeserializer.class)
    private LocalDate startDate;
    @JsonDeserialize(using = LocalDateJsonDeserializer.class)
    private LocalDate endDate;
}
