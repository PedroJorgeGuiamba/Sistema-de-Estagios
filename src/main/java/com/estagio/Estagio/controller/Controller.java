package com.estagio.Estagio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/adicionarformando")
    public void adicionarFormando(){}

    @GetMapping("/adicionarformador")
    public void adicionarFormador(){}

}
