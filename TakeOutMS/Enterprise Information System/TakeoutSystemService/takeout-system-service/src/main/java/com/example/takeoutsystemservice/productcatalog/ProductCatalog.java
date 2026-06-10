package com.example.takeoutsystemservice.productcatalog;

import com.example.takeoutsystemservice.item.Item;
import com.example.takeoutsystemservice.store.Store;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
public class ProductCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "itemToProductCatalog")
    private Item item;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "productCatalog")
    private Set<Item> productCatalogItem;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_cat_storeid")
    @JsonIgnore
    private Store storeToProductCatalog;
}

