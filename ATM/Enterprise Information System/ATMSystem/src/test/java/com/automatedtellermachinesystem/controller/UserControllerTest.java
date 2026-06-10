package com.automatedtellermachinesystem.controller;

import com.automatedtellermachinesystem.model.entity.User;
import com.automatedtellermachinesystem.service.ManageUserCRUDService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserControllerTest {

    private final int userId = 23;
    private final String name = "yigit";
    private final String address = "Ankara";
    @Autowired
    private MockMvc mvc;
    @MockBean
    private ManageUserCRUDService manageUserCRUDService;

    @BeforeAll
    public void setup() {
        User ragcrix = new User();
        ragcrix.setUserId(userId);
        ragcrix.setName(name);
        ragcrix.setAddress(address);

        Mockito.when(manageUserCRUDService.createUser(userId, name, address)).thenReturn(true);
    }

    @Test
    public void testCreateUser() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/user/create")
                        .param("userId", String.valueOf(userId))
                        .param("name", name)
                        .param("address", address)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    public void testQueryUser() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/user/queryUser")
                        .param("userId", String.valueOf(userId))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

    @Test
    public void testDeleteUser() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.post("/user/delete")
                        .param("userId", String.valueOf(userId))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultString = result.getResponse().getContentAsString();
        assertNotNull(resultString);
    }

}
