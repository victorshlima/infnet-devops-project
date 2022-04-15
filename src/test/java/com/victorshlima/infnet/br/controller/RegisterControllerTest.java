//package com.victorshlima.infnet.br.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.victorshlima.infnet.br.repository.UseDtoEntities;
//import com.victorshlima.infnet.br.service.RegisterService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.ApplicationContext;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.Arrays;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
////@ExtendWith(SpringExtension.class)
//
//@SpringBootTest
//@AutoConfigureMockMvc
////@WebMvcTest(controllers = RegisterController.class)
//class RegisterControllerTest {
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @MockBean
//    private RegisterService registerService;
//
//    @BeforeEach
//    void printApplicationContext() {
//        Arrays.stream(applicationContext.getBeanDefinitionNames())
//                .map(name -> applicationContext.getBean(name).getClass().getName())
//                .sorted()
//                .forEach(System.out::println);
//    }
//
//    @Test
//    void whenValidInput_thenReturns200() throws Exception {
//        mockMvc.perform(get("http://localhost:8088/user/1")
//                        .contentType("application/json"))
//                .andExpect(status().isOk());
//    }
//
//
//    @Test
//    void whenValidInput_thenReturns2002() throws Exception {
//        mockMvc.perform(post("http://localhost:8088/user")
//                        .contentType("application/json")
//                        .content("{\"name\": \"Bill12\",  \"lastName\": \"Hicks\",  \"zipCode\": \"300010-666\",  \"number\": 306}"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    void whenValidInput_thenReturns2003() throws Exception {
//        mockMvc.perform(post("/customer")
//                        .contentType("application/json"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    void whenValidInput_thenReturns2200() throws Exception {
//        mockMvc.perform(get("/register/user/1")
//                        .contentType("application/json"))
//                .andExpect(status().isOk());
//    }
//
//}
