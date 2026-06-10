package com.lms.librarymanagment.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@ToString
@Entity(name = "users")
@Table(
    name = "Users",
    uniqueConstraints = {
        @UniqueConstraint(name = "user_name_unique", columnNames = "name")}
)
public class UsersDomain {
    @Id
    @SequenceGenerator(name ="user_sequence",
        sequenceName = "users_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = SEQUENCE,
        generator = "users_sequence"

    )


    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="sex")
    private String sex;

    @JsonIgnore //used to hide sensitive information from response
    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="faculty")
    private String faculty;

    @Column(name="loanedNumber")
    private Long loanedNumber;

    @Column(name="borrowStatus")
    private String borrowStatus;

    @Column(name="suspensionDay")
    private Long suspensionDay;

    @Column(name="overdueFee")
    private Long overdueFee;


}
