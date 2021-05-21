package com.company.Collection2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
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

    @Override
    public String toString() {
        String s="\n Stock List\n" ;
        double totalCost=0.0;
        for (Map.Entry<String,StockItem> item:list.entrySet()){
            StockItem stockItem=item.getValue();
            double itemValue=stockItem.getPrice()* stockItem.getQuantityInstock();
            s=s+stockItem+" . There are "+ stockItem.getQuantityInstock()+" in stock. ";
            s=s+"Value of Items:" +String.format("%.2f",itemValue)+"\n";
            totalCost+=itemValue;

        }
        return s+"Total stock value "+String.format("%.2f",totalCost);

    }
}
