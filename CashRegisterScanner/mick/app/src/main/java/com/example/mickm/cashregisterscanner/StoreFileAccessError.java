package com.example.mickm.cashregisterscanner;

/**
 * Created by MickM on 12/1/17.
 */

public class StoreFileAccessError extends Throwable {
    private String errorMessage;

    public StoreFileAccessError(String message){
        errorMessage = message;
    }

    public String getErrorMessage(){
        return errorMessage;
    }
}
