package com.victorshlima.infnet.br;

import com.victorshlima.infnet.br.service.RegisterService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RegisterApplication {

	@Test
	void contextLoads() {
	}

	@InjectMocks
	RegisterService registerService;

	@Test
	@DisplayName("Busca de funcionários")
	void whenFindUserWithValidId(){
		registerService.findUser(10L);
	}

}
