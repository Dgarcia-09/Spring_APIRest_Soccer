package com.in5bm.soccerfieldmanager.models;

import java.io.Serializable;

import com.in5bm.soccerfieldmanager.DTO.UserRegisterDTO;
import com.in5bm.soccerfieldmanager.utils.PasswordEncrypt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
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


    public User(UserRegisterDTO userDto, String img){

        this.email = userDto.getEmail();
        this.username = userDto.getUsername();
                        //Clase.metodo
        this.password = PasswordEncrypt.encryptPassword(userDto.getPassword());
        this.name = userDto.getName();
        this.surname = userDto.getSurname();
        this.profilePhoto = img;

    }


}
