package com.digi.exception;

import com.digi.common.exceptions.BookingBadRequestException;

public class UserBadRequestException extends BookingBadRequestException {
    public UserBadRequestException(String mesage){
        super(mesage);
    }
}
