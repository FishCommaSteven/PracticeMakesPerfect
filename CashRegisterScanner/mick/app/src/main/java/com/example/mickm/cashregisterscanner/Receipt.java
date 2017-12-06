package com.example.mickm.cashregisterscanner;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by MickM on 12/1/17.
 */

public class Receipt implements Serializable {
    LinkedList<StoreItem> items = new LinkedList<>();
    LinkedList<StoreSale> activeSales = new LinkedList<>();
    LinkedList<String> printedLines = new LinkedList<>();

    int runningTotal;


    public void addItem(Store store, StoreItem item){
        items.add(item);

        for(StoreSale sale : activeSales){
            if(sale.qualifies(items)){
                printedLines.add(sale.getRebateDescription());
                runningTotal -= sale.getRebate(items);
            }
        }

        for(StoreSale sale : store.storeSales){
            if(sale.qualifies(items)){
                printedLines.add(sale.getSaleDescription());
                activeSales.add(sale);
            }
        }
    }
}
