package com.lms.librarymanagment.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity(name = "student")
@Table
public class Student {

    @Id
    @SequenceGenerator(name = "sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name="major")
    private String major;

    @Column(name="programme")
    private String programme;

    @Column(name="registrationStatus")
    private String registrationStatus;

}
