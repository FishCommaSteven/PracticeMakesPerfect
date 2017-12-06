package com.example.mickm.cashregisterscanner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

public class Store implements Serializable {
    private final static String STORE_FILE_NAME = "store.store";

    LinkedList<StoreItem> storeItems = new LinkedList<>();
    LinkedList<StoreItemGroup> itemGroups = new LinkedList<>();
    LinkedList<StoreSale> storeSales = new LinkedList<>();

    public void addItem(StoreItem item){
        storeItems.add(item);
    }

    public void addGroup(StoreItemGroup group){
        itemGroups.add(group);
    }

    public void addSale(StoreSale sale){
        storeSales.add(sale);
    }

    public static Store loadStore() throws StoreFileAccessError {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(STORE_FILE_NAME))){
            Object obj = ois.readObject();
            if(obj instanceof Store) return (Store) obj;
            else throw new StoreFileAccessError("Store file is not of type store");
        } catch (IOException e) {
            e.printStackTrace();
            throw new StoreFileAccessError("An IO Exception occurred when trying to read store file");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new StoreFileAccessError("Unable to read object from store file");
        }
    }

    public void saveStore() throws StoreFileAccessError {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(STORE_FILE_NAME))){
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
            throw new StoreFileAccessError("Error writing to store file");
        }
    }
}
