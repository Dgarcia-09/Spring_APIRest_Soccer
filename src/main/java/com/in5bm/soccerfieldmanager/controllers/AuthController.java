package com.in5bm.soccerfieldmanager.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in5bm.soccerfieldmanager.services.AuthService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
//Ruta general
@RequestMapping("soccerfield/v1/auth")
//EL dominio lo genera springboot automaticamnte
// Dominio/nombreProyecto/version/modulo

public class AuthController {


    private final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    AuthService authService;
    
    // RequestParam
    // RequestBody
    @PostMapping("/register")
    public ResponseEntity < > register{
    
    }
    
}
