package com.automatedtellermachinesystem.controller;

import com.automatedtellermachinesystem.model.entity.BankCard;
import com.automatedtellermachinesystem.model.enums.CardCatalog;
import com.automatedtellermachinesystem.model.enums.CardStatus;
import com.automatedtellermachinesystem.service.ManageBankCardCRUDService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
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
@WebMvcTest(BankCardController.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankCardControllerTest {

    private final int cardId = 1;
    private final CardStatus cardStatus = CardStatus.NORMAL;
    private final CardCatalog cardCatalog = CardCatalog.CREDIT;
    private final int password = 2018;
    private final float balance = 200f;
    @Autowired
    private MockMvc mvc;
    @MockBean
    private ManageBankCardCRUDService manageBankCardCRUDService;

    @BeforeEach
    public void setup() {
        BankCard visaCard = new BankCard();
        visaCard.setCardId(cardId);
        visaCard.setCardStatus(cardStatus);
        visaCard.setCardCatalog(cardCatalog);
        visaCard.setPassword(password);
        visaCard.setBalance(balance);

        Mockito.when(manageBankCardCRUDService.createBankCard(
                cardId, cardStatus, cardCatalog, password, balance)).thenReturn(visaCard);

        Mockito.when(manageBankCardCRUDService.queryBankCard(cardId))
                .thenReturn(visaCard);
    }

    @Test
    public void testCreateUser() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/bankcard/create")
                        .param("cardId", String.valueOf(cardId))
                        .param("cardStatus", cardStatus.name())
                        .param("cardCatalog", cardCatalog.name())
                        .param("password", String.valueOf(password))
                        .param("balance", String.valueOf(balance))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    public void testModifyBankCard() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/bankcard/modify")
                        .param("cardId", String.valueOf(cardId))
                        .param("cardStatus", cardStatus.name())
                        .param("cardCatalog", cardCatalog.name())
                        .param("password", String.valueOf(password))
                        .param("balance", String.valueOf(balance))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    public void testQueryBankCard() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/bankcard/queryCard")
                        .param("cardId", String.valueOf(cardId))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    public void testDeleteUser() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/bankcard/delete")
                        .param("cardId", String.valueOf(cardId))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

}
