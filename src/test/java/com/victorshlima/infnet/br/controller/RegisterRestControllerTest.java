package com.victorshlima.infnet.br.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.victorshlima.infnet.br.domain.dto.UserDto;
import com.victorshlima.infnet.br.service.RegisterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static com.victorshlima.infnet.br.repository.UseDtoEntities.USER_DTO_1;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = RegisterController.class)
class RegisterRestControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ObjectMapper objectMapper;

  @MockBean
  private RegisterService registerService;

//  @Spy
//  @InjectMocks
//  private RegisterController registerController;

  @Test
  void whenGetUserthenReturns() throws Exception {
   UserDto USER_DTO = UserDto.builder().id(1L).name("Bill").lastName("Hicks").zipCode("12345111").number(101).build();

    when(registerService.findUser(any(Long.class))).thenReturn(USER_DTO);

    UserDto userResult =   registerService.findUser(1L);
    assertEquals(userResult.getId(), 1L);


  }


    @Test
    void whenIsValidThenReturnsTrue() throws Exception {
        UserDto USER_DTO = UserDto.builder().id(1L).name("Bill").lastName("Hicks").zipCode("12345111").number(101).build();
        when(registerService.isValid(any(Long.class))).thenReturn(true);

        var userResult =   registerService.isValid(USER_DTO.getId());

        assertEquals(true   , userResult);

    }

    @Test
    void whenDeleteUserThenDelete() throws Exception {
        UserDto USER_DTO = UserDto.builder().id(1L).name("Bill").lastName("Hicks").zipCode("12345111").number(101).build();

        registerService.deleteUser(USER_DTO.getId());

        assertDoesNotThrow(() -> registerService.deleteUser(USER_DTO.getId()) );

    }

//    @Test
//    void whenGetUserthenReturns200() throws Exception {
//        UserDto USER_DTO = UserDto.builder().id(1L).name("Bill").lastName("Hicks").zipCode("12345111").number(101).build();
//        ResponseEntity  expectResponseEntity= ResponseEntity.ok().build();
//
//        when(registerService.findUser(any(Long.class))).thenReturn(USER_DTO);
//
//        ResponseEntity responseEntity =   registerController.getUser(1L);
//        assertEquals(expectResponseEntity.getStatusCode(), responseEntity.getStatusCode()
//        );
//
//    }




}