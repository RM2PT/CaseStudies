package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LibraryManagementSystemSystemTest {

    @Autowired
    LibraryManagementSystemSystem libraryManagementSystemSystem;

    @Test
    void dueSoonNotification() {
        assertDoesNotThrow(()->{
            libraryManagementSystemSystem.dueSoonNotification();
        });
    }

    @Test
    void checkOverDueandComputeOverDueFee() {
        assertDoesNotThrow(()->{
            libraryManagementSystemSystem.checkOverDueandComputeOverDueFee();
        });
    }

    @Test
    void countDownSuspensionDay() {
        assertDoesNotThrow(()->{
            libraryManagementSystemSystem.countDownSuspensionDay();
        });
    }

    @Test
    void recommendBook() {
        //User存在 rb不存在
        assertDoesNotThrow(()->{
            assertTrue(libraryManagementSystemSystem.recommendBook("1","112233","A Book","1.0","Jack","ACM","this is a book","1234"));
        });
        //rb存在
        assertThrows(PreconditionException.class,()->{
            libraryManagementSystemSystem.recommendBook("1","1","A Book","1.0","Jack","ACM","this is a book","1234");
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            libraryManagementSystemSystem.recommendBook("-1","1","A Book","1.0","Jack","ACM","this is a book","1234");
        });
    }
}