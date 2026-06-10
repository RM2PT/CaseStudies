package spring.net.mydream.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.net.mydream.utils.PreconditionException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ThirdPartyServicesTest {
    @Autowired
    ThirdPartyServices thirdPartyServices;
    @Test
    void sendNotificationEmail() {
        //email不为空
        assertDoesNotThrow(()->{
            thirdPartyServices.sendNotificationEmail("123@123.com");
        });
        //email为空
        assertThrows(PreconditionException.class,()->{
            thirdPartyServices.sendNotificationEmail("");
        });
    }
}