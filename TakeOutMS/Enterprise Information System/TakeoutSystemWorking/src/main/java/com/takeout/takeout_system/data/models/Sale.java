package com.takeout.takeout_system.data.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean isComplete=false;
    private BigDecimal amount;
    private boolean isReadyToPay;
    private boolean isAccept=false;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToOne
    private Customer customer;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToOne
    private Payment payment;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToMany(fetch = FetchType.EAGER)
    private Set<OrderLineItem> orderLineItems;
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @OneToOne
    private Store store;
    private boolean isCurrentSale=false;
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @OneToOne
    private Delivery delivery;
    private LocalDateTime time;

    public boolean isCurrentSale() {
        return isCurrentSale;
    }

    public void setCurrentSale(boolean currentSale) {
        isCurrentSale = currentSale;
    }

    public boolean isAccept() {
        return isAccept;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    public void setAccept(boolean accept) {
        isAccept = accept;
    }
}
