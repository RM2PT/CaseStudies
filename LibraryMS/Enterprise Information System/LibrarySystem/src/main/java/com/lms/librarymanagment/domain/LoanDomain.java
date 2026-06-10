package com.lms.librarymanagment.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@ToString
@Entity(name = "loan")
public class Loan {

    @Id
    @SequenceGenerator(
        name = "sequence", allocationSize = 1
    )
    @GeneratedValue(strategy = SEQUENCE,generator = "loan_sequence")
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="loanDate")
    private LocalDate loanDate;

    @Column(name="renewDate")
    private LocalDate renewDate;

    @Column(name="duedate")
    private LocalDate dueDate;

    @Column(name="returnDate")
    private LocalDate returnDate;

    @Column(name="renewedTimes")
    private Long renewedTimes;

    @Column(name="isReturned")
    private Boolean isReturned;

    @Column(name="overDueFee")
    private Long overDueFee;

    @Column(name="overDue3Days")
    private Boolean overDue3Days;

    @Column(name="overDue10Days")
    private Boolean overDue10Days;

    @Column(name="overDue17Days")
    private Boolean overDue17Days;

    @Column(name="overDue31Days")
    private Boolean overDue31Days;



}
