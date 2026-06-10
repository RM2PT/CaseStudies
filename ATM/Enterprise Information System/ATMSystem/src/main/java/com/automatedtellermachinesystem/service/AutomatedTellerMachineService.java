package com.automatedtellermachinesystem.service;

import com.automatedtellermachinesystem.model.entity.BankCard;
import org.springframework.stereotype.Service;

/**
 * this service includes these methods: depositFunds inputPassword inputCard ejectCard
 * withdrawCash printReceipt checkBalance cardIdentification
 */
@Service
public class AutomatedTellerMachineService {

    private final ManageBankCardCRUDService bankCardCRUDService;

    private BankCard inputCard = null;
    private boolean cardIdValidated;
    private boolean passwordValidated;
    private boolean isWithdraw;
    private boolean isDeposit;
    private float withdrawedNumber;
    private float depositedNumber;

    public AutomatedTellerMachineService(ManageBankCardCRUDService bankCardCRUDService) {
        this.bankCardCRUDService = bankCardCRUDService;
    }

    public boolean ejectCard() {
        if (this.passwordValidated && this.cardIdValidated
                && this.inputCard != null) {
            this.inputCard = null;
            this.passwordValidated = false;
            this.cardIdValidated = false;
            this.isWithdraw = false;
            this.isDeposit = false;
            this.withdrawedNumber = 0.0f;
            this.depositedNumber = 0.0f;
            return true;
        }
        return false;
    }

    public boolean inputCard(int cardId) {
        BankCard bankCard = bankCardCRUDService.queryBankCard(cardId);
        if (bankCard != null) {
            this.cardIdValidated = true;
            this.inputCard = bankCard;
            return true;
        } else {
            this.cardIdValidated = false;
            return false;
        }
    }

    public boolean inputPassword(int password) {
        if (this.cardIdValidated && this.inputCard != null) {
            if (inputCard.getPassword() == password) {
                this.passwordValidated = true;
                return true;
            } else {
                this.passwordValidated = false;
                return false;
            }
        }
        return false;
    }

    public float printReceipt() {
        float result = 0.0f;
        if (this.cardIdValidated && this.passwordValidated
                && this.inputCard != null) {
            if (this.isWithdraw) {
                result = this.withdrawedNumber;
            } else if (this.isDeposit) {
                result = this.depositedNumber;
            }
        }
        return result;
    }

    public float checkBalance() {
        if (this.cardIdValidated && this.passwordValidated
                && this.inputCard != null) {
            return this.inputCard.getBalance();
        }
        throw new IllegalArgumentException("Some card information may be wrong!");
    }

    public boolean withdrawCash(float quantity) {
        if (this.cardIdValidated && this.passwordValidated
                && this.inputCard != null) {
            if (this.inputCard.getBalance() > quantity) {
                this.inputCard.setBalance(this.inputCard.getBalance() - quantity);
                this.withdrawedNumber = quantity;
                this.isWithdraw = true;
                return true;
            }
        }
        return false;
    }

    public boolean depositFunds(float quantity) {
        if (this.cardIdValidated && this.passwordValidated
                && this.inputCard != null) {
            if (quantity > 100) {
                this.inputCard.setBalance(this.inputCard.getBalance() + quantity);
                this.depositedNumber = quantity;
                this.isDeposit = true;
                return true;
            }
        }
        return false;
    }

}
