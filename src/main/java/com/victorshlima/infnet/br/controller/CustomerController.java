package com.victorshlima.infnet.br.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  @PostMapping("/customer")
  public String hello() {
    return "hello";
  }

}