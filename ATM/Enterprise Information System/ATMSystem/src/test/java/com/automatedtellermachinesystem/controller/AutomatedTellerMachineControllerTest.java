package com.automatedtellermachinesystem.controller;

import com.automatedtellermachinesystem.model.entity.BankCard;
import com.automatedtellermachinesystem.model.enums.CardCatalog;
import com.automatedtellermachinesystem.model.enums.CardStatus;
import com.automatedtellermachinesystem.service.AutomatedTellerMachineService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AutomatedTellerMachineController.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AutomatedTellerMachineControllerTest {

    private final int cardId = 1;
    private final CardStatus cardStatus = CardStatus.NORMAL;
    private final CardCatalog cardCatalog = CardCatalog.CREDIT;
    private final int password = 2018;
    private final float balance = 200f;
    private final float quantity = 50f;
    private final float quantityToBeDeposited = 110f;
    @Autowired
    private MockMvc mvc;
    @MockBean
    private AutomatedTellerMachineService automatedTellerMachineService;

    @BeforeAll
    public void setup() {
        BankCard visaCard = new BankCard();
        visaCard.setCardId(cardId);
        visaCard.setCardStatus(cardStatus);
        visaCard.setCardCatalog(cardCatalog);
        visaCard.setPassword(password);
        visaCard.setBalance(balance);

        Mockito.when(automatedTellerMachineService.inputCard(cardId)).thenReturn(true);
    }

    @Test
    @Order(1)
    public void testInputCard() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/automatedTellerMachine/inputCard")
                        .param("cardId", String.valueOf(cardId))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    @Order(2)
    public void testInputPassword() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/automatedTellerMachine/inputPassword")
                        .param("password", String.valueOf(password))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    @Order(3)
    public void testCheckBalance() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/automatedTellerMachine/checkBalance")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    @Order(4)
    public void testWithdrawCash() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/automatedTellerMachine/withdrawCash")
                        .param("quantity", String.valueOf(quantity))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    @Order(5)
    public void testDepositFunds() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/automatedTellerMachine/depositFunds")
                        .param("quantity", String.valueOf(quantityToBeDeposited))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    @Order(6)
    public void testPrintReceipt() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/automatedTellerMachine/printReceipt")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    @Order(7)
    public void testEjectCard() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/automatedTellerMachine/ejectCard")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

}
