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
    void createStudent() {
        //userID不存在
        assertDoesNotThrow(()->{
            assertTrue(manageUserCRUDService.createStudent("112233","jack",0,"112233","123@123.com","123","math",0,0));
        });
        //userID重复
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.createStudent("1","jack",0,"1","123@123.com","123","math",0,0);
        });
    }

    @Test
    void modifyStudent() {
        //user存在
        assertDoesNotThrow(()->{
            manageUserCRUDService.modifyStudent("1","jack",0,"1","123@123.com","123","math",0,0);
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.modifyStudent("-1","jack",0,"1","123@123.com","123","math",0,0);
        });
    }

    @Test
    void createFaculty() {
        //userID不存在
        assertDoesNotThrow(()->{
            assertTrue(manageUserCRUDService.createFaculty("112233","jack",0,"112233","123@123.com","123",0,0));
        });
        //userID重复
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.createFaculty("1","jack",0,"1","123@123.com","123",0,0);
        });
    }

    @Test
    void modifyFaculty() {
        //user存在
        assertDoesNotThrow(()->{
            manageUserCRUDService.modifyFaculty("1","jack",0,"1","123@123.com","123","math",0,0);
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.modifyFaculty("-1","jack",0,"1","123@123.com","123","math",0,0);
        });
    }

    @Test
    void createUser() {
        //userID不存在
        assertDoesNotThrow(()->{
            assertTrue(manageUserCRUDService.createUser("112233","jack",0,"112233","123@123.com","123",0,0,0,0));
        });
        //userID重复
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.createUser("1","jack",0,"1","123@123.com","123",0,0,0,0);
        });
    }

    @Test
    void queryUser() {
        //user存在
        assertDoesNotThrow(()->{
            manageUserCRUDService.queryUser("1");
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.queryUser("-1");
        });
    }

    @Test
    void modifyUser() {
        //user存在
        assertDoesNotThrow(()->{
            manageUserCRUDService.modifyUser("1","jack",0,"1","123@123.com","123",0,0,0,0);
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.modifyUser("-1","jack",0,"1","123@123.com","123",0,0,0,0);
        });
    }

    @Test
    void deleteUser() {
        //user存在
        assertDoesNotThrow(()->{
            manageUserCRUDService.deleteUser("1");
        });
        //user不存在
        assertThrows(PreconditionException.class,()->{
            manageUserCRUDService.deleteUser("-1");
        });
    }
}