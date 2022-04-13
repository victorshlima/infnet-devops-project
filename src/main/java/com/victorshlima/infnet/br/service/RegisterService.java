package com.victorshlima.infnet.br.service;

import com.victorshlima.infnet.br.domain.dto.UserDto;
import com.victorshlima.infnet.br.domain.dto.UserDtoParse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.victorshlima.infnet.br.repository.UseDtoEntities.*;
import static com.victorshlima.infnet.br.repository.UseDtoEntities.userId1;

@Log4j2
@Service
@RequiredArgsConstructor
public class RegisterService {

    //Apenas para simular o retorno do Banco
    public static UserDto findUser(@NonNull Long id){

        if(id.equals(1L))
            return userId1;
        if(id.equals(2L))
            return userId2;
        if(id.equals(3L))
            return userId3;
        else
            return null;
    }

    public void deleteUser(Long id) {
        if(id > 3 || id < 1)//simula o erro do banco
            throw new NullPointerException("Entity not found");
    }

    public static UserDto saveUser(UserDto userId) {

        if(userId.getId().equals(1L))
            return UserDtoParse.formatUserDto(userId1);
        if(userId.getId().equals(2L))
            return userId2;
        if(userId.getId().equals(3L))
            return userId3;
        else
            return null;

    }

    @Autowired
    RestTemplate restTemplate;
  //  @Override
    public Boolean isValid(Long id) {
        String url = String.format("http://localhost:8087/validate/%s",id);
        log.info(String.format("URL CHAMADA:::::: %s ",url));
        var isValidResult = restTemplate.getForObject(url, Boolean.class);
        log.info(String.format("RETORNO DA URL CHAMADA:::::: %s ",isValidResult));
        return isValidResult;
    }
}
