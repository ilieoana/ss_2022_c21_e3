package com.example.ss_2022_c21_e3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Ss2022C21E3ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser
        // create a security context for test; simulates that authentication happens and let you tests just the authorization
    void test1() throws Exception {
        mockMvc.perform(get("/demo"))
                .andExpect(status().isOk());
    }

    @Test
    @WithMockUser
        // MockUser doesn't have any authorities in default
    void test2() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isForbidden());
    }

    @Test
    @WithMockUser(authorities = "read")
    void test3() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk());
    }

}
