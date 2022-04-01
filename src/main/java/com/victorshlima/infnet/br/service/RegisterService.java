package com.victorshlima.infnet.br.service;

import com.victorshlima.infnet.br.domain.dto.UserDto;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {


    public UserDto findUser(@NonNull Long id){

        // criar um case para simular o banco talves

        return  UserDto.builder()
                .name("Bill: " + id)
                .lastName("Hicks")
                .zipCode("300010-666")
                .number(306)
                .build();
    }


}
