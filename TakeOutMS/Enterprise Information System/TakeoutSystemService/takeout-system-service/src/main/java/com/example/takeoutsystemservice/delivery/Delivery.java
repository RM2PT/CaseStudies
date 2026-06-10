package com.example.takeoutsystemservice.delivery;


import com.example.takeoutsystemservice.sale.Sale;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String attribute;
    private String uuid;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "delivery")
    private Set<Sale> deliveryToSale;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "SaleToDelivery")
    @JsonIgnore
    private Sale singleSale;


}
