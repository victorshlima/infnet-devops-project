package com.victorshlima.infnet.br.controller;

import com.victorshlima.infnet.br.domain.dto.UserDto;
import com.victorshlima.infnet.br.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Random;
@Slf4j
@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    public RegisterController (RegisterService registerService){
    this.registerService = registerService;
    }

    @GetMapping(value ="/user/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id){
        log.info("getUser");
        var user =  registerService.findUser(id);
        return ResponseEntity.ok().body(user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Long> deleteUser(@PathVariable("id") Long id){
        //Criar serviço
        var randon = new Random();
        log.info("deleteUser");
       // melhor lançar uma exception do que essa ganbiarra
        if (randon.nextBoolean()) return ResponseEntity.ok().body(id);
        else return ResponseEntity.notFound().build();

    }

    @PostMapping("/user")
    public ResponseEntity<UserDto> userRegister(@RequestBody UserDto user){
        //TODO remover a necessidade do envio do ID
        log.info("userRegister");
        registerService.isValid(user.getId());
        registerService.saveUser(user);
        URI location = URI.create("/user/" + user.getId());

        log.info(String.format("RETORNO:::::: %s %s",location,user));
        return ResponseEntity.created(location).body(user);
    }


}
