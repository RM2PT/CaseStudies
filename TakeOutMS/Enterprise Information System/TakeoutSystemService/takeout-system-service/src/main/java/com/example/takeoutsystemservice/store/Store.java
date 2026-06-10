package com.example.takeoutsystemservice.store;

import com.example.takeoutsystemservice.item.Item;
import com.example.takeoutsystemservice.productcatalog.ProductCatalog;
import com.example.takeoutsystemservice.sale.Sale;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private boolean isOpened;
    private String uuid;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL , mappedBy = "itemToStore")
    private Item item;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "storeToSale")
    private Set<Sale> storeToSale;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "storeSale")
    private Sale sale;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "storeToItems")
    private Set<Item> itemsStore;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "storeToProductCatalog")
    private Set<ProductCatalog> storeToProductCatalog;


}
