package com.takeout.takeout_system.data.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductCatalogue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToMany
    private Set<Item> items;
}
