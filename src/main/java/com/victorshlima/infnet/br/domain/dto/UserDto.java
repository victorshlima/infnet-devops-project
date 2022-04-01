package com.victorshlima.infnet.br.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private String name;
    private String lastName;
    private String zipCode;
    private Integer number;

}
