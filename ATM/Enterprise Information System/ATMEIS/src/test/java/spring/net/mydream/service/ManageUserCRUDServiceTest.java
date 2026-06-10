package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ManageUserCRUDServiceTest {

    @Autowired
    ManageUserCRUDService manageUserCRUDService;

    @Test
    void createUser() {
        //UserID不存在
        assertDoesNotThrow(()->{
            assertTrue(manageUserCRUDService.createUser(112233,"Jack","Beijing"));
        });
        //UserID重复
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.createUser(1,"Jack","Beijing");
        });
    }

    @Test
    void queryUser() {
        //UserID存在
        assertDoesNotThrow(()->{
            manageUserCRUDService.queryUser(1);
        });
        //UserID不存在
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.queryUser(-1);
        });
    }

    @Test
    void modifyUser() {
        //UserID存在
        assertDoesNotThrow(()->{
            assertTrue(manageUserCRUDService.modifyUser(1,"Tom","Shanghai"));
        });
        //UserID不存在
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.modifyUser(-1,"Tom","Shanghai");
        });
    }

    @Test
    void deleteUser() {
        //UserID存在
        assertDoesNotThrow(()->{
            assertTrue(manageUserCRUDService.deleteUser(1));
        });
        //UserID不存在
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.deleteUser(-1);
        });
    }
}