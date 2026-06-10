package com.automatedtellermachinesystem.service;

import com.automatedtellermachinesystem.model.entity.BankCard;
import com.automatedtellermachinesystem.model.enums.CardCatalog;
import com.automatedtellermachinesystem.model.enums.CardStatus;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AutomatedTellerMachineServiceTest {

    private final int cardId = 1;
    private final CardStatus cardStatus = CardStatus.NORMAL;
    private final CardCatalog cardCatalog = CardCatalog.CREDIT;
    private final int password = 2018;
    private final float balance = 200f;
    private final float quantity = 50f;
    private final float quantityToBeDeposited = 110f;
    private AutomatedTellerMachineService automatedTellerMachineService;
    @MockBean
    private ManageBankCardCRUDService bankCardCRUDService;
    private BankCard visaCard;

    @BeforeAll
    public void setup() {
        automatedTellerMachineService = new AutomatedTellerMachineService(bankCardCRUDService);
        visaCard = new BankCard();
        visaCard.setCardId(cardId);
        visaCard.setCardStatus(cardStatus);
        visaCard.setCardCatalog(cardCatalog);
        visaCard.setPassword(password);
        visaCard.setBalance(balance);

        Mockito.when(bankCardCRUDService.queryBankCard(cardId)).thenReturn(visaCard);
    }

    @Test
    @Order(1)
    public void testInputCard_thenProcessShouldBeSuccessful() {
        boolean result = automatedTellerMachineService.inputCard(cardId);

        assertTrue(result);
    }

    @Test
    @Order(2)
    public void testInputPassword_thenProcessShouldBeSuccessful() {
        boolean result = automatedTellerMachineService.inputPassword(password);

        assertTrue(result);
    }

    @Test
    @Order(3)
    public void testCheckBalance_thenBalanceShouldBeReturned() {
        float balanceToBeChecked = automatedTellerMachineService.checkBalance();

        assertEquals(balance, balanceToBeChecked);
    }

    @Test
    @Order(4)
    public void testWithdrawCash_thenProcessShouldBeSuccessful() {
        boolean result = automatedTellerMachineService.withdrawCash(quantity);

        assertTrue(result);
    }

    @Test
    @Order(5)
    public void testDepositFunds_thenProcessShouldBeSuccessful() {
        boolean result = automatedTellerMachineService.depositFunds(quantityToBeDeposited);

        assertTrue(result);
    }

    @Test
    @Order(6)
    public void testPrintReceipt_thenNumberShouldBePrinted() {
        float result = automatedTellerMachineService.printReceipt();

        assertEquals(quantity, result);
    }

    @Test
    @Order(7)
    public void testEjectCard_thenProcessShouldBeSuccessful() {
        boolean result = automatedTellerMachineService.ejectCard();

        assertTrue(result);
    }

}
