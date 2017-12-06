package com.example.mickm.cashregisterscanner;

import java.io.Serializable;
import java.util.LinkedList;

public class StoreSale implements Serializable {
    String saleDescription;
    String rebateDescription;
    LinkedList<StoreItem> qualifyingItems = new LinkedList<>();
    // ie: for a "buy 3 get 2 free" sale:
    int minimumItemCount; // 3
    int maximumItemCount; // 2
    int saleAmount; // 100
    SaleType type; // percent_off

    public StoreSale(String saleDescription, String rebateDescription, int minimumItemCount, int maximumItemCount, int saleAmount, SaleType type){
        this.saleDescription = saleDescription;
        this.rebateDescription = rebateDescription;
        this.minimumItemCount = minimumItemCount;
        this.maximumItemCount = maximumItemCount;
        this.saleAmount = saleAmount;
        this.type = type;
    }

    public void addItem(StoreItem item){
        qualifyingItems.add(item);
    }

    public void addGroup(LinkedList<StoreItem> allItems, StoreItemGroup group){
        for(StoreItem item : allItems){
            if(item.isInGroup(group)) qualifyingItems.add(item);
        }
    }

    boolean qualifies(LinkedList<StoreItem> receipt) {
        int count = 0;
        for(StoreItem item : receipt){
            if(qualifyingItems.contains(item)) count++;
        }
        return count >= minimumItemCount;
    }

    int getRebate(LinkedList<StoreItem> receipt){
        // find items in receipt
        // calculate sale amount
        // remove sale items from receipt
        // remove item(s) from maxItemCount
        // return sale amount
        return 0;
    }

    String getSaleDescription(){
        return saleDescription;
    }

    String getRebateDescription(){
        return rebateDescription;
    }
}
