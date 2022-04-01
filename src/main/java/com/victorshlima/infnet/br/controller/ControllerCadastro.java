package com.victorshlima.infnet.br.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCadastro {



        @GetMapping("/user")
        String getUser(String user){
            return "user";
        }




}
