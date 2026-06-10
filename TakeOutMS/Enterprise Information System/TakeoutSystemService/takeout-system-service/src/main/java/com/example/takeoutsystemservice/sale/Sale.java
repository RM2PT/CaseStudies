package com.example.takeoutsystemservice.sale;

import com.example.takeoutsystemservice.customer.Customer;
import com.example.takeoutsystemservice.delivery.Delivery;
import com.example.takeoutsystemservice.orderlineitem.OrderLineItem;
import com.example.takeoutsystemservice.payment.Payment;
import com.example.takeoutsystemservice.store.Store;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    private LocalDate time;
    private boolean isComplete;
    private double amount;
    private boolean isReadyToPay;
    private boolean isAccept;
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "saleToOrderLines")
    private Set<OrderLineItem> saleToOrderLineItem;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "sale_orderline_Item_id")
    private OrderLineItem singleOrderLineItem;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "sale_payment_id")
    private Payment saleToPayment;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "sale_store_id")
    private Store storeSale;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "sale_customer_id")
    private Customer saleToCustomer;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "sale_delivery_id")
    private Delivery SaleToDelivery;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id")
    @JsonIgnore
    private Delivery delivery;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "store_sale_id")
    @JsonIgnore
    private Store storeToSale;
}
