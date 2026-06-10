package com.automatedtellermachinesystem.repository;

import com.automatedtellermachinesystem.model.entity.BankCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankCardRepository extends JpaRepository<BankCard, Long> {
    BankCard findByCardId(int cardId);

    List<BankCard> findAll();

    BankCard save(BankCard bankCard);

    void delete(BankCard bankCard);
}