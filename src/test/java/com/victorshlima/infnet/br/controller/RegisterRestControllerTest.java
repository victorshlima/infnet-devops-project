//package com.victorshlima.infnet.br.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.victorshlima.infnet.br.repository.UseDtoEntities;
//import com.victorshlima.infnet.br.service.RegisterService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(controllers = RegisterController.class)
//class RegisterRestControllerTest {
//
//  @Autowired
//  private MockMvc mockMvc;
//
//  @Autowired
//  private ObjectMapper objectMapper;
//
//  @MockBean
//  private RegisterService registerService;
//
//  @Test
//  void whenValidUrlAndMethodAndContentType_thenReturns200() throws Exception {
//
//       mockMvc.perform(post("/user")
//            .content(String.valueOf(UseDtoEntities.userId1))
//            .contentType("application/json"))
//            .andExpect(status().isOk());
//
//  }
//
//}