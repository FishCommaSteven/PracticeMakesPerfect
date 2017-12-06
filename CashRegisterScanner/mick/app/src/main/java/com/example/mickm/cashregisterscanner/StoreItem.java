package com.example.mickm.cashregisterscanner;

import java.io.Serializable;
import java.util.LinkedList;

public class StoreItem implements Serializable {
    String sku;
    String description;
    LinkedList<StoreItemGroup> groups = new LinkedList<>();

    public StoreItem(String sku, String description){
        this.sku = sku;
        this.description = description;
    }

    public void addGroup(StoreItemGroup group){
        groups.add(group);
    }

    public boolean isInGroup(StoreItemGroup group){
        return groups.contains(group);
    }
}
