package com.AddressService.demo.Exceptions;

public class BillException extends RuntimeException{
    public BillException() {
    }

    public BillException(String message) {
        super(message);
    }
}
