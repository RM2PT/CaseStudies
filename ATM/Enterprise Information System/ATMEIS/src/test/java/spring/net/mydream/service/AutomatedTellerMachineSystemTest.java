package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.entity.BankCard;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AutomatedTellerMachineSystemTest {
    @Autowired
    AutomatedTellerMachineSystem automatedTellerMachineSystem;

    @Test
    void inputCard() {
        //有效卡号输入
        assertDoesNotThrow(() -> {
            automatedTellerMachineSystem.inputCard(-1);
        });
        assertFalse((Boolean) automatedTellerMachineSystem.currentUtils.getAttribute("CardIDValidated"));
        //无效卡号输入
        assertDoesNotThrow(() -> {
            automatedTellerMachineSystem.inputCard(1);
        });
        assertTrue((Boolean) automatedTellerMachineSystem.currentUtils.getAttribute("CardIDValidated"));
    }

    @Test
    void inputPassword() {
        //卡有效 密码正确
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated", true);
        BankCard bankCard = new BankCard();
        bankCard.setPassword(1234);
        automatedTellerMachineSystem.currentUtils.setAttribute("BankCard", bankCard);
        assertDoesNotThrow(() -> {
            automatedTellerMachineSystem.inputPassword(1234);
        });
        assertTrue((Boolean) automatedTellerMachineSystem.currentUtils.getAttribute("PasswordValidated"));
        //卡有效 密码不正确
        assertDoesNotThrow(() -> {
            automatedTellerMachineSystem.inputPassword(4321);
        });
        assertFalse((Boolean) automatedTellerMachineSystem.currentUtils.getAttribute("PasswordValidated"));
        //卡有效 Inputcard 无定义
        automatedTellerMachineSystem.currentUtils.setAttribute("BankCard", null);
        assertThrows(PreconditionException.class, () -> {
            automatedTellerMachineSystem.inputPassword(1234);
        });
        //卡无效
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated", false);
        assertThrows(PreconditionException.class, () -> {
            automatedTellerMachineSystem.inputPassword(1234);
        });
    }

    @Test
    void printReceipt() {
        //返回WithdrawedNumber
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated", true);
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated", true);
        BankCard bankCard = new BankCard();
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard", bankCard);
        automatedTellerMachineSystem.currentUtils.setAttribute("IsWithdraw", true);
        automatedTellerMachineSystem.currentUtils.setAttribute("WithdrawedNumber", 111);
        double WithdrawedNumber = 111;
        automatedTellerMachineSystem.currentUtils.setAttribute("IsDeposit", true);
        automatedTellerMachineSystem.currentUtils.setAttribute("DepositedNumber", 222);
        double DepositedNumber = 222;
        assertDoesNotThrow(() -> {
            assertEquals(WithdrawedNumber, automatedTellerMachineSystem.printReceipt());
        });
        //返回DepositedNumber
        automatedTellerMachineSystem.currentUtils.setAttribute("IsWithdraw", false);
        assertDoesNotThrow(() -> {
            assertEquals(DepositedNumber, automatedTellerMachineSystem.printReceipt());
        });
        //返回0
        automatedTellerMachineSystem.currentUtils.setAttribute("IsDeposit", false);
        assertDoesNotThrow(() -> {
            assertEquals(0, automatedTellerMachineSystem.printReceipt());
        });
        //InputCard null
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard", null);
        assertThrows(PreconditionException.class, () -> {
            automatedTellerMachineSystem.printReceipt();
        });
        //PasswordValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",false);
        assertThrows(PreconditionException.class, () -> {
            automatedTellerMachineSystem.printReceipt();
        });
        //CardIDValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",false);
        assertThrows(PreconditionException.class, () -> {
            automatedTellerMachineSystem.printReceipt();
        });
    }

    @Test
    void checkBalance() {
        //余额123
        BankCard bankCard=new BankCard();
        bankCard.setBalance(123);
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard",bankCard);
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",true);
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",true);
        assertDoesNotThrow(()->{
            assertEquals(123,automatedTellerMachineSystem.checkBalance());
        });
        //InputCard null
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard",null);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.checkBalance();
        });
        //CardIDValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",false);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.checkBalance();
        });
        //PasswordValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",false);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.checkBalance();
        });
    }

    @Test
    void ejectCard() {
        //正常情况
        BankCard bankCard=new BankCard();
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard",bankCard);
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",true);
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",true);
        assertDoesNotThrow(()->{
            assertTrue(automatedTellerMachineSystem.ejectCard());
        });
        //InputCard null
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard",null);
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",true);
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",true);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.ejectCard();
        });
        //CardIDValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",false);
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",true);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.ejectCard();
        });
        //PasswordValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",false);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.ejectCard();
        });
    }

    @Test
    void withdrawCash() {
        //正常情况
        BankCard bankCard=new BankCard();
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard",bankCard);
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",true);
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",true);
        assertDoesNotThrow(()->{
            assertTrue(automatedTellerMachineSystem.withdrawCash(1));
        });
        //InputCard null
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard",null);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.withdrawCash(1);
        });
        //CardIDValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",false);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.withdrawCash(1);
        });
        //PasswordValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",false);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.withdrawCash(1);
        });
    }

    @Test
    void depositFunds() {
        //正常情况
        BankCard bankCard=new BankCard();
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard",bankCard);
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",true);
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",true);
        assertDoesNotThrow(()->{
            assertTrue(automatedTellerMachineSystem.depositFunds(1));
        });
        //InputCard null
        automatedTellerMachineSystem.currentUtils.setAttribute("InputCard",null);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.depositFunds(1);
        });
        //CardIDValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("CardIDValidated",false);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.depositFunds(1);
        });
        //PasswordValidated false
        automatedTellerMachineSystem.currentUtils.setAttribute("PasswordValidated",false);
        assertThrows(PreconditionException.class,()->{
            automatedTellerMachineSystem.depositFunds(1);
        });
    }

    @Test
    void cardIdentification() {
        assertDoesNotThrow(()->{
            assertTrue(automatedTellerMachineSystem.cardIdentification());
        });
    }
}