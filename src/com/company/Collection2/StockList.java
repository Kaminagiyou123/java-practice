package com.company.Collection2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new HashMap<>();
    }

    public int addStock(StockItem item){
        if (item!=null){
            StockItem instock=list.getOrDefault(item.getName(),item);
            if (instock!=item){
                instock.adjustStock(instock.getQuantityInstock());
            } else {
               list.put(item.getName(), item);
                return item.getQuantityInstock();
            }
        }
      return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem inStock=list.getOrDefault(item,null);
        if ((inStock!=null )&& (inStock.getQuantityInstock()>=quantity)&& quantity>0){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }
    public StockItem get(String key){
        return this.get(key);
    }
    public Map<String,StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }
}
