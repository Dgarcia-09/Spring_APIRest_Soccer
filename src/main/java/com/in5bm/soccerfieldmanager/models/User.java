package com.in5bm.soccerfieldmanager.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "user")

//Buena practica: todas las clases deben implementar esta interfaz

public class User implements Serializable {

    //Clase envolvente

    @Id
    @Column(name="id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY) Un autoincrementable es sensible a ser heackeado
    /*
     * Hacer esto en entidades que posean informacion sensible del usuario
     */
    private String id;

    @Email(message = "Ingrese un email valido")
    @Column(unique = true, name = "email")
    private String email;


    @Column(unique = true, name= "username")
    private String username;

    private String name;
    private String surname;

    @NotBlank
    private String password;

    private String profilePhoto;


}
