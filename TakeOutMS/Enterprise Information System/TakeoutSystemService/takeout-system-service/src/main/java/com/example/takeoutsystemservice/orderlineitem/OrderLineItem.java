package com.example.takeoutsystemservice.orderlineitem;


import com.example.takeoutsystemservice.item.Item;
import com.example.takeoutsystemservice.sale.Sale;
import com.example.takeoutsystemservice.store.Store;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private double subAmount;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "sale_orderline_id")
    private Sale saleToOrderLines;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "orderLineItem")
    private Item orderLineItemToItem;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "singleOrderLineItem")
    private Sale orderLineItemToSale;



}
