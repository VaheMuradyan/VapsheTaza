package com.digi.common.exceptions;

public abstract class BookingBadRequestException extends RuntimeException{
    public BookingBadRequestException(String message){
        super(message);
    }
}
