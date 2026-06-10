package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ManageBookCRUDServiceTest {
    @Autowired
    ManageBookCRUDService manageBookCRUDService;
    @Test
    void createBook() {
        //book不存在
        assertDoesNotThrow(()->{
            assertTrue(manageBookCRUDService.createBook("112233","title","1.0","jack","ACM","this is a book","123",123));
        });
        //book重复
        assertThrows(PreconditionException.class,()->{
            manageBookCRUDService.createBook("1","title","1.0","jack","ACM","this is a book","123",123);
        });
    }

    @Test
    void queryBook() {
        //book存在
        assertDoesNotThrow(()->{
            manageBookCRUDService.queryBook("1");
        });
        //book不存在
        assertThrows(PreconditionException.class,()->{
            manageBookCRUDService.queryBook("-1");
        });
    }

    @Test
    void modifyBook() {
        //book存在
        assertDoesNotThrow(()->{
            manageBookCRUDService.modifyBook("1","title","1.0","jack","ACM","this is a book","123",123);
        });
        //book不存在
        assertThrows(PreconditionException.class,()->{
            manageBookCRUDService.modifyBook("-1","title","1.0","jack","ACM","this is a book","123",123);
        });
    }

    @Test
    void deleteBook() {
        //book存在
        assertDoesNotThrow(()->{
            manageBookCRUDService.deleteBook("1");
        });
        //book不存在
        assertThrows(PreconditionException.class,()->{
            manageBookCRUDService.deleteBook("-1");
        });
    }
}