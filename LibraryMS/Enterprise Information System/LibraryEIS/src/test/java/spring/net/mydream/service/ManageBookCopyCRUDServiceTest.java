package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ManageBookCopyCRUDServiceTest {

    @Autowired
    ManageBookCopyCRUDService manageBookCopyCRUDService;
    @Test
    void addBookCopy() {
        //book存在
        assertDoesNotThrow(()->{
            assertTrue(manageBookCopyCRUDService.addBookCopy("1","1","location"));
        });
        //book不存在
        assertThrows(PreconditionException.class,()->{
            manageBookCopyCRUDService.addBookCopy("-1","1","location");
        });
    }

    @Test
    void queryBookCopy() {
        //bookcopy 存在
        assertDoesNotThrow(()->{
            manageBookCopyCRUDService.queryBookCopy("1");
        });
        //bookcopy 不存在
        assertThrows(PreconditionException.class,()->{
            manageBookCopyCRUDService.queryBookCopy("-1");
        });
    }

    @Test
    void modifyBookCopy() {
        //bookcopy 存在
        assertDoesNotThrow(()->{
            manageBookCopyCRUDService.modifyBookCopy("1",0,"loc",false);
        });
        //bookcopy 不存在
        assertThrows(PreconditionException.class,()->{
            manageBookCopyCRUDService.modifyBookCopy("-1",0,"loc",false);
        });
    }

    @Test
    void deleteBookCopy() {
        //bookcopy 存在
        assertDoesNotThrow(()->{
            manageBookCopyCRUDService.deleteBookCopy("1");
        });
        //bookcopy 不存在
        assertThrows(PreconditionException.class,()->{
            manageBookCopyCRUDService.deleteBookCopy("-1");
        });
    }
}