package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ManageSubjectCRUDServiceTest {
    @Autowired
    ManageSubjectCRUDService manageSubjectCRUDService;
    @Test
    void createSubject() {
        //Sub Name不存在
        assertDoesNotThrow(()->{
            assertTrue(manageSubjectCRUDService.createSubject("112233"));
        });
        //Sub Name重复
        assertThrows(PreconditionException.class,()->{
            manageSubjectCRUDService.createSubject("1");
        });
    }

    @Test
    void querySubject() {
        //subject存在
        assertDoesNotThrow(()->{
            manageSubjectCRUDService.querySubject("1");
        });
        //subject不存在
        assertThrows(PreconditionException.class,()->{
            manageSubjectCRUDService.querySubject("-1");
        });
    }

    @Test
    void modifySubject() {
        //subject存在
        assertDoesNotThrow(()->{
            manageSubjectCRUDService.modifySubject("1");
        });
        //subject不存在
        assertThrows(PreconditionException.class,()->{
            manageSubjectCRUDService.modifySubject("-1");
        });
    }

    @Test
    void deleteSubject() {
        //subject存在
        assertDoesNotThrow(()->{
            manageSubjectCRUDService.deleteSubject("1");
        });
        //subject不存在
        assertThrows(PreconditionException.class,()->{
            manageSubjectCRUDService.deleteSubject("-1");
        });
    }
}