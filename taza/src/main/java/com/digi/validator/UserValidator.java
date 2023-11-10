package com.digi.validator;

import com.digi.exception.UserBadRequestException;

public class UserValidator {
    public static void passwordValidator(String password){
        if(password.length() < 8){
            throw new UserBadRequestException("Password is short");
        }
        int countOfDigit = 0;
        int countOfUppercase = 0;
        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);

            if(Character.isDigit(c)){
                countOfDigit++;
            }else if(Character.isUpperCase(c)){
                countOfUppercase++;
            }
        }
        if(countOfDigit < 1 && countOfUppercase < 2){
            throw new UserBadRequestException("Password must contain at list");
        }
    }

    public static void yearValidator(Integer year){
        if(year < 1920 || year > 2023){
            throw new UserBadRequestException("");
        }
    }
}
