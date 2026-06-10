package com.takeout.takeout_system.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Delivery extends User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(insertable = false, nullable = false)
    private Long id;
    private String name;
    private String attribute3;
    private boolean isCurrentDelivery = false;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Sale> sale;
    private Role role;
}
