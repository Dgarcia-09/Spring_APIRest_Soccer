package com.in5bm.soccerfieldmanager.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class PasswordEncrypt {
    public static String encryptPassword(String password){
        return BCrypt.withDefaults().hashToString(20, password.toCharArray());
        
    }


}
