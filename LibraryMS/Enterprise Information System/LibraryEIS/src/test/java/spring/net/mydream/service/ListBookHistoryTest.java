package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ListBookHistoryTest {
    @Autowired
    ListBookHistory listBookHistory;
    @Test
    void listBorrowHistory() {
        //user存在
        assertDoesNotThrow(()->{
            listBookHistory.listBorrowHistory("1");
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            listBookHistory.listBorrowHistory("-1");
        });
    }

    @Test
    void listHodingBook() {
        //user存在
        assertDoesNotThrow(()->{
            listBookHistory.listHodingBook("1");
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            listBookHistory.listHodingBook("-1");
        });
    }

    @Test
    void listOverDueBook() {
        //user存在
        assertDoesNotThrow(()->{
            listBookHistory.listOverDueBook("1");
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            listBookHistory.listOverDueBook("-1");
        });
    }

    @Test
    void listReservationBook() {
        //user存在
        assertDoesNotThrow(()->{
            listBookHistory.listReservationBook("1");
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            listBookHistory.listReservationBook("-1");
        });
    }

    @Test
    void listRecommendBook() {
        //user存在
        assertDoesNotThrow(()->{
            listBookHistory.listRecommendBook("1");
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            listBookHistory.listRecommendBook("-1");
        });
    }
}