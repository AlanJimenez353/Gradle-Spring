package com.coderhouse.controleradvice.handle;

public class ProductError extends Exception {
    private String message;

    public ProductError(String message){
        super(message);
    }
}
