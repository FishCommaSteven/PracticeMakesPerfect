package com.example.mickm.cashregisterscanner;

import java.io.Serializable;

public class StoreItemGroup implements Serializable {
    String id;
    String name;
    String description;
    
    public StoreItemGroup(String id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
