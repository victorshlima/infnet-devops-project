package com.victorshlima.infnet.br.service;

import com.victorshlima.infnet.br.domain.dto.UserDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static com.victorshlima.infnet.br.repository.UseDtoEntities.USER_DTO_1;
import static  org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RegisterServiceTest {

    @Test
    void contextLoads() {
    }

    @InjectMocks
    RegisterService registerService;

    @Test
    @DisplayName("whenFindUserWithValidIdReturnUserDtoInstance")
    void whenFindUserWithValidIdReturnUserDtoInstance(){
      var user =  registerService.findUser(1L);
        assertInstanceOf(UserDto.class, user);
    }

    @Test
    @DisplayName("whenFindUserWith_Id_1_ReturnUserDto1")
    void whenFindUserWithValidId(){
        var user =  registerService.findUser(1L);
        assertInstanceOf(UserDto.class, user);
        assertEquals(USER_DTO_1, user);
    }

    @Test
    @DisplayName("whenFindUserWithNullValue")
    void whenFindUserWithNullValue(){
        assertThrows(NullPointerException.class, () -> {registerService.findUser(null);} );
    }

    @Test
    @DisplayName("whenDeleteUserWithValidDoesNotThrownException")
    void whenDeleteUserWithValidDoesNotThrownException(){
        assertDoesNotThrow(() -> {registerService.deleteUser(1L);});
    }

    @Test
    @DisplayName("whenDeleteUserWithValidThrownException")
    void whenDeleteUserWithValidThrownException(){
        assertThrows(NullPointerException.class, () -> {registerService.deleteUser(5L);});
    }

    @Test
    @DisplayName("")
    void whenRegisterUserReturnUserRegistred(){
        var userId1Formated = UserDto.builder().id(1L).name("Bill").lastName("Hicks").zipCode("12345-111").number(101).build();
        assertEquals(userId1Formated, registerService.saveUser(USER_DTO_1));
    }

}
