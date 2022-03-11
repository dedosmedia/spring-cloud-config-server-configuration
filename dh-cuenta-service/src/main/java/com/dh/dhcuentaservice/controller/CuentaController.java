package com.dh.dhcuentaservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RefreshScope
@RestController
@RequestMapping("/cuenta")
public class CuentaController {

    @Value("${message.text:Este es el mensaje por defecto}")
    private String message;

    @GetMapping
    public String getCuenta(){
        return this.message;
    }
}
