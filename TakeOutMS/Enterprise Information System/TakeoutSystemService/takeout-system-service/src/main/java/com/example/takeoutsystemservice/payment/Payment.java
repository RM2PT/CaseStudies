package com.example.takeoutsystemservice.payment;

import com.example.takeoutsystemservice.sale.Sale;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amountTendered;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "saleToPayment")
    private Sale paymentToSale;



}
