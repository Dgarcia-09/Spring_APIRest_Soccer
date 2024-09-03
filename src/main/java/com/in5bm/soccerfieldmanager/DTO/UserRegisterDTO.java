package com.in5bm.soccerfieldmanager.DTO;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

//Getters and Setters
@Data

public class UserRegisterDTO implements Serializable {



    private String id;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Ingresa una direccion de correo valida")
    private String email;

    @NotBlank(message = "La contrsena es obligatoria")
    private String password;

    @NotBlank(message = "El usuario es obligatorio")
    private String username;
    private String name;
    private String surname;

}
