package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManageBankCardCRUDServiceTest {
    @Autowired
    ManageBankCardCRUDService manageBankCardCRUDService;

    @Test
    void createBankCard() {
        //未创建的CardID
        assertDoesNotThrow(() -> {
            assertTrue(manageBankCardCRUDService.createBankCard(111222, 0, 0, 123, 123));
        });
        //重复的CardID
        assertThrows(PreconditionException.class, () -> {
            manageBankCardCRUDService.createBankCard(1, 0, 0, 123, 123);
        });
    }

    @Test
    void queryBankCard() {
        //存在的CardID
        assertDoesNotThrow(() -> {
            manageBankCardCRUDService.queryBankCard(1);
        });
        //不存在的CardID
        assertThrows(PreconditionException.class, () -> {
            manageBankCardCRUDService.queryBankCard(-1);
        });
    }

    @Test
    void modifyBankCard() {
        //存在的CardID
        assertDoesNotThrow(() -> {
            assertTrue(manageBankCardCRUDService.modifyBankCard(1, 0, 0, 123, 123));
        });
        //不存在的CardID
        assertThrows(PreconditionException.class, () -> {
            manageBankCardCRUDService.modifyBankCard(1, 0, 0, 123, 123);
        });
    }

    @Test
    void deleteBankCard() {
        //存在的CardID
        assertDoesNotThrow(() -> {
            assertTrue(manageBankCardCRUDService.deleteBankCard(1));
        });
        //不存在的CardID
        assertThrows(PreconditionException.class, () -> {
            manageBankCardCRUDService.deleteBankCard(-1);
        });
    }
}