package com.in5bm.soccerfieldmanager.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class PasswordEncrypt {
    public static String encryptPassword(String password){
        return BCrypt.withDefaults().hashToString(20, password.toCharArray());
        
    }

    public static boolean verifyPassword(String plainPassword, String encriptedPassword){
        BCrypt.Result result = BCrypt.verifyer().verify(plainPassword.toCharArray(), encryptedPassword);
        return result.verified;
    }


}
