package com.automatedtellermachinesystem.model.entity;

import com.automatedtellermachinesystem.model.enums.CardCatalog;
import com.automatedtellermachinesystem.model.enums.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class BankCard {
    @Id
    @GeneratedValue
    private Long id;
    private int cardId;
    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;
    @Enumerated(EnumType.STRING)
    private CardCatalog cardCatalog;
    private int password;
    private float balance;
}
