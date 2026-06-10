import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.entity.*;
import spring.net.mydream.redis.CurrentUtils;
import spring.net.mydream.service.*;
import spring.net.mydream.utils.PreconditionException;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LoanTest {
    @Autowired
    EnterValidatedCreditReferencesModule enterValidatedCreditReferencesModule;
    @Autowired
    EvaluateLoanRequestModule evaluateLoanRequestModule;
    @Autowired
    GenerateLoanLetterAndAgreementModule generateLoanLetterAndAgreementModule;
    @Autowired
    LoanProcessingSystemSystem loanProcessingSystemSystem;
    @Autowired
    ManageLoanTermCRUDService manageLoanTermCRUDService;
    @Autowired
    SubmitLoanRequestModule submitLoanRequestModule;
    @Autowired
    ThirdPartyServices thirdPartyServices;
    @Autowired
    CurrentUtils currentUtils;

    @Test
    void ListSubmitedLoanRequestTest(){
        assertDoesNotThrow(()->{
            enterValidatedCreditReferencesModule.listSubmitedLoanRequest();
        });
    }

    @Test
    void ChooseLoanRequestTest() {
        // the product exists
        assertDoesNotThrow(()->{
            enterValidatedCreditReferencesModule.chooseLoanRequest(0);
        });
        // not exists
        assertThrows(PreconditionException.class,()->{
            enterValidatedCreditReferencesModule.chooseLoanRequest(1);
        });
    }

    @Test
    void MarkRequestValidTest(){
        assertDoesNotThrow(()->{
            enterValidatedCreditReferencesModule.markRequestValid();
        });
    }

    @Test
    void ListTenLoanRequestTest() {
        // the product exists
        assertDoesNotThrow(()->{
            evaluateLoanRequestModule.listTenLoanRequest();
        });
    }

    @Test
    void ChooseOneForReviewTest() {
        // the product exists
        assertDoesNotThrow(()->{
            evaluateLoanRequestModule.chooseOneForReview(0);
        });
        // not exists
        assertThrows(PreconditionException.class,()->{
            evaluateLoanRequestModule.chooseOneForReview(1);
        });
    }

    @Test
    void CheckCreditHistoryTest(){
        assertDoesNotThrow(()->{
            evaluateLoanRequestModule.checkCreditHistory();
        });
        currentUtils.setAttribute("CurrentOrderProduct", null);
        assertThrows(PreconditionException.class,()->{
            evaluateLoanRequestModule.checkCreditHistory();
        });
    }

    @Test
    void ReviewCheckingAccountTest(){
        assertDoesNotThrow(()->{
            evaluateLoanRequestModule.reviewCheckingAccount();
        });
        currentUtils.setAttribute("CurrentOrderProduct", null);
        assertThrows(PreconditionException.class,()->{
            evaluateLoanRequestModule.reviewCheckingAccount();
        });
    }

    @Test
    void ListAvaiableLoanTermTest(){
        assertDoesNotThrow(()->{
            evaluateLoanRequestModule.listAvaiableLoanTerm();
        });
    }

    @Test
    void AddLoanTermTest() {

        // if there is not a current-order-product
        currentUtils.setAttribute("CurrentLoanRequest", null);

        // the supplier exists
        assertThrows(PreconditionException.class,()->{
            evaluateLoanRequestModule.addLoanTerm(0);
        });
        // not exists
        assertThrows(PreconditionException.class,()->{
            evaluateLoanRequestModule.addLoanTerm(1);
        });

        // if there is a current-order-product
        currentUtils.setAttribute("CurrentLoanRequest", new LoanRequest());

        // the supplier exists
        assertDoesNotThrow(()->{
            evaluateLoanRequestModule.addLoanTerm(0);
        });
        // not exists
        assertThrows(PreconditionException.class,()->{
            evaluateLoanRequestModule.addLoanTerm(1);
        });
    }

    @Test
    void ApproveLoanRequestTest() {

        // if there is not a current-order-product
        currentUtils.setAttribute("CurrentLoanRequest", null);

        // the supplier exists
        assertThrows(PreconditionException.class,()->{
            evaluateLoanRequestModule.approveLoanRequest();
        });

        // if there is a current-order-product
        currentUtils.setAttribute("CurrentLoanRequest", new LoanRequest());

        // the supplier exists
        assertDoesNotThrow(()->{
            evaluateLoanRequestModule.approveLoanRequest();
        });
    }

    @Test
    void ListApprovalRequestTest(){
        assertDoesNotThrow(()->{
            generateLoanLetterAndAgreementModule.listApprovalRequest();
        });
    }

    @Test
    void GenereateApprovalLetterTest(){
        assertDoesNotThrow(()->{
            generateLoanLetterAndAgreementModule.genereateApprovalLetter(0);
        });
        assertThrows(PreconditionException.class,()->{
            generateLoanLetterAndAgreementModule.genereateApprovalLetter(1);
        });
    }

    @Test
    void EmailToAppliantTest(){
        assertDoesNotThrow(()->{
            generateLoanLetterAndAgreementModule.emailToAppliant();
        });
    }

    @Test
    void GenerateLoanAgreementTest() {

        // if there is not a current-order-product
        currentUtils.setAttribute("CurrentLoanRequest", null);

        // the supplier exists
        assertThrows(PreconditionException.class,()->{
            generateLoanLetterAndAgreementModule.generateLoanAgreement();
        });

        // if there is a current-order-product
        currentUtils.setAttribute("CurrentLoanRequest", new LoanRequest());

        // the supplier exists
        assertDoesNotThrow(()->{
            generateLoanLetterAndAgreementModule.generateLoanAgreement();
        });
    }

    @Test
    void PrintLoanAgreementTest() {

        // if there is not a current-order-product
        currentUtils.setAttribute("CurrentLoanRequest", null);

        // the supplier exists
        assertThrows(PreconditionException.class,()->{
            generateLoanLetterAndAgreementModule.printLoanAgreement(1);
        });

        // if there is a current-order-product
        currentUtils.setAttribute("CurrentLoanRequest", new LoanRequest());

        // the supplier exists
        assertDoesNotThrow(()->{
            generateLoanLetterAndAgreementModule.printLoanAgreement(1);
        });
    }

    @Test
    void BookNewLoanTest() {

        assertDoesNotThrow(()->{
            loanProcessingSystemSystem.bookNewLoan(0, 0, 0, new Date(114514), new Date(1919810), 10);
        });

        assertThrows(PreconditionException.class,()->{
            loanProcessingSystemSystem.bookNewLoan(0, 1, 0, new Date(114514), new Date(1919810), 10);
        });

        assertThrows(PreconditionException.class,()->{
            loanProcessingSystemSystem.bookNewLoan(1, 0, 0, new Date(114514), new Date(1919810), 10);
        });

        assertThrows(PreconditionException.class,()->{
            loanProcessingSystemSystem.bookNewLoan(0, 0, 1, new Date(114514), new Date(1919810), 10);
        });

        assertThrows(PreconditionException.class,()->{
            loanProcessingSystemSystem.bookNewLoan(0, 1, 1, new Date(114514), new Date(1919810), 10);
        });

        assertThrows(PreconditionException.class,()->{
            loanProcessingSystemSystem.bookNewLoan(1, 0, 1, new Date(114514), new Date(1919810), 10);
        });

        // CashDesk exists
        assertDoesNotThrow(()->{
            loanProcessingSystemSystem.bookNewLoan(1, 1, 0, new Date(114514), new Date(1919810), 10);
        });

        // not exists
        assertThrows(PreconditionException.class,()->{
            loanProcessingSystemSystem.bookNewLoan(1, 1, 1, new Date(114514), new Date(1919810), 10);
        });

    }

    @Test
    void GenerateStandardPaymentNoticeTest(){
        assertDoesNotThrow(()->{
            loanProcessingSystemSystem.generateStandardPaymentNotice();
        });
    }

    @Test
    void GenerateLateNoticeTest(){
        assertDoesNotThrow(()->{
            loanProcessingSystemSystem.generateLateNotice();
        });
    }

    @Test
    void LoanPaymentTest(){
        assertDoesNotThrow(()->{
            loanProcessingSystemSystem.loanPayment(0);
        });
        assertThrows(PreconditionException.class,()->{
            loanProcessingSystemSystem.loanPayment(1);
        });
    }

    @Test
    void CloseOutLoanTest(){
        assertDoesNotThrow(()->{
            loanProcessingSystemSystem.closeOutLoan(0);
        });
        assertThrows(PreconditionException.class,()->{
            loanProcessingSystemSystem.closeOutLoan(1);
        });
    }

    @Test
    void ListBookedLoansTest(){
        assertDoesNotThrow(()->{
            loanProcessingSystemSystem.listBookedLoans();
        });
    }

    @Test
    void CreateLoanTermTest() {

        // op exists
        assertThrows(PreconditionException.class,()->{
            manageLoanTermCRUDService.createLoanTerm(0, "lemon");
        });

        // not exists
        assertDoesNotThrow(()->{
            manageLoanTermCRUDService.createLoanTerm(1, "lemon");
        });

    }

    @Test
    void QueryLoanTermTest() {

        // op exists
        assertThrows(PreconditionException.class,()->{
            manageLoanTermCRUDService.queryLoanTerm(0);
        });

        // not exists
        assertDoesNotThrow(()->{
            manageLoanTermCRUDService.queryLoanTerm(1);
        });

    }

    @Test
    void ModifyLoanTermTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageLoanTermCRUDService.modifyLoanTerm(0, "lemon");
        });

        // not exists
        assertDoesNotThrow(()->{
            manageLoanTermCRUDService.modifyLoanTerm(1, "lemon");
        });
    }

    @Test
    void DeleteLoanTermTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            manageLoanTermCRUDService.deleteLoanTerm(0);
        });

        // not exists
        assertDoesNotThrow(()->{
            manageLoanTermCRUDService.deleteLoanTerm(1);
        });
    }

    @Test
    void EnterLoanInformationTest() {
        // op exists
        assertThrows(PreconditionException.class,()->{
            submitLoanRequestModule.enterLoanInformation(0, "lemon", 10, "forest", 10, 114514, "lemon", 1919, "lemon", "forest", "sxc", 114, 514);
        });

        // not exists
        assertDoesNotThrow(()->{
            submitLoanRequestModule.enterLoanInformation(1, "lemon", 10, "forest", 10, 114514, "lemon", 1919, "lemon", "forest", "sxc", 114, 514);
        });
    }

    @Test
    void CreditRequestTest(){
        assertDoesNotThrow(()->{
            submitLoanRequestModule.creditRequest();
        });
        currentUtils.setAttribute("CurrentLoanRequest", null);
        assertThrows(PreconditionException.class,()->{
            submitLoanRequestModule.creditRequest();
        });
    }

    @Test
    void AccountStatusRequestTest(){
        assertDoesNotThrow(()->{
            submitLoanRequestModule.accountStatusRequest();
        });
        currentUtils.setAttribute("CurrentLoanRequest", null);
        assertThrows(PreconditionException.class,()->{
            submitLoanRequestModule.accountStatusRequest();
        });
    }

    @Test
    void CalculateScoreTest(){
        assertDoesNotThrow(()->{
            submitLoanRequestModule.calculateScore();
        });
        currentUtils.setAttribute("CurrentLoanRequest", null);
        assertThrows(PreconditionException.class,()->{
            submitLoanRequestModule.calculateScore();
        });
    }

}
