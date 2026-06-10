package com.automatedtellermachinesystem.service;

import com.automatedtellermachinesystem.model.entity.BankCard;
import com.automatedtellermachinesystem.model.enums.CardCatalog;
import com.automatedtellermachinesystem.model.enums.CardStatus;
import com.automatedtellermachinesystem.repository.BankCardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ManageBankCardCRUDServiceTest {

    private final int cardId = 1;
    private final CardStatus cardStatus = CardStatus.NORMAL;
    private final CardCatalog cardCatalog = CardCatalog.CREDIT;
    private final int password = 2018;
    private final float balance = 200f;
    private ManageBankCardCRUDService manageBankCardCRUDService;
    @MockBean
    private BankCardRepository bankCardRepository;
    private BankCard visaCard;

    @BeforeEach
    public void setup() {
        manageBankCardCRUDService = new ManageBankCardCRUDService(bankCardRepository);
        visaCard = new BankCard();
        visaCard.setCardId(cardId);
        visaCard.setCardStatus(cardStatus);
        visaCard.setCardCatalog(cardCatalog);
        visaCard.setPassword(password);
        visaCard.setBalance(balance);

        Mockito.when(bankCardRepository.save(visaCard)).thenReturn(visaCard);

        Mockito.when(bankCardRepository.findByCardId(cardId))
                .thenReturn(visaCard);
    }

    @Test
    public void testCreateBankCard_thenCreatedCardShouldBeReturned() {
        BankCard createdCard = manageBankCardCRUDService.createBankCard(cardId, cardStatus, cardCatalog,
                password, balance);

        assertEquals(cardId, createdCard.getCardId());
    }

    @Test
    public void testModifyBankCard_thenProcessShouldBeSuccessful() {
        Boolean result = manageBankCardCRUDService.modifyBankCard(cardId, cardStatus, cardCatalog,
                password, balance);

        assertEquals(true, result);
    }


    @Test
    public void testQueryBankCard1_thenVisaCardShouldBeReturned() {
        BankCard found = manageBankCardCRUDService.queryBankCard(cardId);

        assertNotNull(found);
        assertEquals(visaCard.getCardId(), found.getCardId());
    }

    @Test
    public void testDeleteUser_thenNoExceptionThrows() {
        assertDoesNotThrow(() -> manageBankCardCRUDService.deleteBankCard(cardId));
    }

}
