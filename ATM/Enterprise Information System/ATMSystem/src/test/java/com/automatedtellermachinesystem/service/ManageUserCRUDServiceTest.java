package com.automatedtellermachinesystem.service;

import com.automatedtellermachinesystem.model.entity.User;
import com.automatedtellermachinesystem.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ManageUserCRUDServiceTest {

    private final int userId = 23;
    private final String name = "yigit";
    private final String address = "Ankara";
    private ManageUserCRUDService manageUserCRUDService;
    @MockBean
    private UserRepository userRepository;
    private User ragcrix;

    @BeforeEach
    public void setup() {
        manageUserCRUDService = new ManageUserCRUDService(userRepository);
        ragcrix = new User();
        ragcrix.setUserId(userId);
        ragcrix.setName(name);
        ragcrix.setAddress(address);

        Mockito.when(userRepository.save(ragcrix)).thenReturn(ragcrix);

        Mockito.when(userRepository.findByUserId(userId))
                .thenReturn(ragcrix);
    }

    @Test
    public void testCreateUser_thenCreatedUserShouldBeReturned() {
        boolean result = manageUserCRUDService.createUser(userId, name, address);

        assertTrue(result);
    }

    @Test
    public void testQueryUser23_thenRagcrixShouldBeReturned() {
        User found = manageUserCRUDService.queryUser(userId);

        assertNotNull(found);
        assertEquals(ragcrix.getName(), found.getName());
        assertEquals(ragcrix.getId(), found.getId());
    }

    @Test
    public void testDeleteUser_thenNoExceptionThrows() {
        assertDoesNotThrow(() -> manageUserCRUDService.deleteUser(userId));
    }

}
