package com.in5bm.soccerfieldmanager.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
@Table(name = "user")

//Buena practica: todas las clases deben implementar esta interfaz

public class User implements Serializable {

    //Clase envolvente

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email(message = "Ingrese un email valido")
    @Column(unique = true, name = "email")
    private String email;


    @Column(unique = true, name= "username")
    private String username;

    private String name;
    private String surname;
    private String password;
    private String urlProfilePhoto;


}
