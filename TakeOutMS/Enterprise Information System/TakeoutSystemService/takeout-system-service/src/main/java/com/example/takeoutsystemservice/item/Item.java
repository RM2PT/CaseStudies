package com.example.takeoutsystemservice.item;


import com.example.takeoutsystemservice.delivery.Delivery;
import com.example.takeoutsystemservice.orderlineitem.OrderLineItem;
import com.example.takeoutsystemservice.productcatalog.ProductCatalog;
import com.example.takeoutsystemservice.store.Store;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String uuid;
    private double price;
    private double orderPrice;
    private Integer stockNumber;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "item_prod_catgid")
    private ProductCatalog itemToProductCatalog;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "item_store_id")
    private Store itemToStore;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_catag_id")
    @JsonIgnore
    private ProductCatalog productCatalog;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "store_items_id")
    @JsonIgnore
    private Store storeToItems;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_lineItem_id")
    private OrderLineItem orderLineItem;
}
