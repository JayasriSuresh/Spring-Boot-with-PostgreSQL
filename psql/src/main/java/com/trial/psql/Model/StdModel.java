package com.trial.psql.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Student")
public class StdModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roll;

    @Column(name = "Name")
    private String name;

    @Column(name = "Course")
    private String course;

    @Column(name = "Mark")
    private int mark;

    @Column(name = "Backlogs")
    private Boolean backlogs;
}
