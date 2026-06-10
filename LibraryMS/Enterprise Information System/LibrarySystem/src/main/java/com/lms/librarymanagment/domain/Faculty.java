package com.lms.librarymanagment.domain;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity(name = "faculty")
@Table
public class Faculty {

    @Id
    @SequenceGenerator(name = "sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name="position")
    private String position;

    @Column(name="status")
    private String status;


}
