package com.victorshlima.infnet.br.repository;

import com.victorshlima.infnet.br.domain.dto.UserDto;

public class UseDtoEntities {

    public static UserDto USER_DTO_1 = UserDto.builder().id(1L).name("Bill").lastName("Hicks").zipCode("12345111").number(101).build();
    public static UserDto userId2 = UserDto.builder().id(1L).name("Justin").lastName("Bieber").zipCode("30010222").number(202).build();
    public static UserDto userId3 = UserDto.builder().id(1L).name("Madona").lastName("Aguilera").zipCode("30010333").number(303).build();

}
