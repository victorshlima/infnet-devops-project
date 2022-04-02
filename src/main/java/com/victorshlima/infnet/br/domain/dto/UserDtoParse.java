package com.victorshlima.infnet.br.domain.dto;

import com.victorshlima.infnet.br.util.FormatUtils;

public class UserDtoParse {

    public static UserDto  formatUserDto(UserDto userDto){
        return UserDto.builder()
                .id(userDto.getId())
                .name(userDto.getName())
                .lastName(userDto.getLastName())
                .number(userDto.getNumber())
                .zipCode(FormatUtils.formatZipCode(userDto.getZipCode()))
                .build();
    }
}
