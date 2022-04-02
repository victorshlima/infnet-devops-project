package com.victorshlima.infnet.br.controller;

import com.victorshlima.infnet.br.domain.dto.UserDto;
import com.victorshlima.infnet.br.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class RegisterController {

    private final RegisterService registerService;

    public RegisterController (RegisterService registerService){
    this.registerService = registerService;
    }

    @GetMapping(value ="/user/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id){
        var user =  registerService.findUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Long> deleteUser(@PathVariable("id") Long id){
        //Criar serviço
        var randon = new Random();
       // melhor lançar uma exception do que essa ganbiarra
        if (randon.nextBoolean()) return new ResponseEntity<>( id, HttpStatus.OK);
        else return new ResponseEntity<>(id, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/user")
    public ResponseEntity<UserDto> userRegister(@RequestBody UserDto user){
        //TODO remover a necessidade do envio do ID
        registerService.saveUser(user);
     return new ResponseEntity<UserDto>(user, HttpStatus.CREATED);
    }


}
