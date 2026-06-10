package com.automatedtellermachinesystem.service;

import com.automatedtellermachinesystem.model.entity.BankCard;
import com.automatedtellermachinesystem.model.enums.CardCatalog;
import com.automatedtellermachinesystem.model.enums.CardStatus;
import com.automatedtellermachinesystem.repository.BankCardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * this service includes these methods: createBankCard queryBankCard modifyBankCard deleteBankCard
 */
@Slf4j
@Service
public class ManageBankCardCRUDService {

    private BankCardRepository bankCardRepository;

    public ManageBankCardCRUDService(BankCardRepository bankCardRepository) {
        this.bankCardRepository = bankCardRepository;
    }

    public BankCard queryBankCard(int cardId) {
        return bankCardRepository.findByCardId(cardId);
    }

    public BankCard createBankCard(int cardId, CardStatus cardStatus,
                                   CardCatalog cardCatalog, int password, float balance) {
        return bankCardRepository.save(
                this.setBankCardFields(new BankCard(), cardId, cardStatus, cardCatalog, password, balance));
    }

    public boolean modifyBankCard(int cardId, CardStatus cardStatus,
                                  CardCatalog cardCatalog, int password, float balance) {
        try {
            BankCard oldBankCard = this.queryBankCard(cardId);
            this.setBankCardFields(oldBankCard, cardId, cardStatus, cardCatalog, password, balance);
            bankCardRepository.save(oldBankCard);
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return false;
        }

        return true;
    }

    public boolean deleteBankCard(int cardId) {
        try {
            BankCard bankCard = this.queryBankCard(cardId);
            if (bankCard != null) {
                bankCardRepository.delete(bankCard);
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return false;
        }

        return true;
    }

    private BankCard setBankCardFields(BankCard bankCard, int cardId, CardStatus cardStatus,
                                       CardCatalog cardCatalog, int password, float balance) {
        bankCard.setCardId(cardId);
        bankCard.setCardStatus(cardStatus);
        bankCard.setCardCatalog(cardCatalog);
        bankCard.setPassword(password);
        bankCard.setBalance(balance);

        return bankCard;
    }


}
