package com.takeout.takeout_system.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(insertable = false, nullable = false)
    private Long id;
    private String name;
    private String address;
    private Role role;
}
