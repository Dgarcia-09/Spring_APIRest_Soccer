package com.in5bm.soccerfieldmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Servicio
 */

@Configuration
public class CloudinaryConfig {

//Acceso a cloudinary

    @Bean
    Cloudinary cloudinary(){
        return new Cloudinary(ObjectUtils, asMap(
            "cloud_name","867351693933511",
            "api_key", "867351693933511",
            "api_secret","hxho9DSLfaEqkOPvjuFxKXTp3vE"
        ));
    }

}
