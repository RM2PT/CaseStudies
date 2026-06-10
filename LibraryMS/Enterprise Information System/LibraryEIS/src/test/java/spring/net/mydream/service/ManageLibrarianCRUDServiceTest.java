package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ManageLibrarianCRUDServiceTest {
    @Autowired
    ManageLibrarianCRUDService manageLibrarianCRUDService;
    @Test
    void createLibrarian() {
        //LibID不存在
        assertDoesNotThrow(()->{
            assertTrue(manageLibrarianCRUDService.createLibrarian("112233","A lib","112233"));
        });
        //LibID重复
        assertThrows(PreconditionException.class,()->{
            manageLibrarianCRUDService.createLibrarian("1","a lib","112233");
        });
    }

    @Test
    void queryLibrarian() {
        //Lib存在
        assertDoesNotThrow(()->{
            manageLibrarianCRUDService.queryLibrarian("1");
        });
        //Lib不存在
        assertThrows(PreconditionException.class,()->{
            manageLibrarianCRUDService.queryLibrarian("-1");
        });
    }

    @Test
    void modifyLibrarian() {
        //Lib存在
        assertDoesNotThrow(()->{
            manageLibrarianCRUDService.modifyLibrarian("1","lib","123");
        });
        //Lib不存在
        assertThrows(PreconditionException.class,()->{
            manageLibrarianCRUDService.modifyLibrarian("-1","lib","123");
        });
    }

    @Test
    void deleteLibrarian() {
        //Lib存在
        assertDoesNotThrow(()->{
            manageLibrarianCRUDService.deleteLibrarian("1");
        });
        //Lib不存在
        assertThrows(PreconditionException.class,()->{
            manageLibrarianCRUDService.deleteLibrarian("-1");
        });
    }
}