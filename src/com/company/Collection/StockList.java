package com.company.Collection;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String,StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }
    public int addStock(StockItem item){
        if (item!=null){
            StockItem inStock=list.getOrDefault(item.getName(),item);
            //check if we already have quantites of this item;
            if (inStock!=item){
                item.adjustStock(inStock.availableQuantity());
            }
            list.put(item.getName(),item);
            return item.availableQuantity();
        }
        return 0;
    }
    public int sellStock(String item,int quantity){
        StockItem instock=list.get(item);
        if ((instock!=null) && (quantity>0)){
            instock.finalizeStock(-quantity);
        }
        return 0;
//        StockItem instock= list.getOrDefault(item,null);
//        if ((instock!=null) && (instock.availableQuantity()>=quantity) && (quantity>0)){
//            instock.finalizeStock(-quantity);
//            return quantity;
//        }
//        return 0;
    }
    public int reserveStock(String item, int quantity){
        StockItem instock=list.get(item);
        if ((instock!=null)&& quantity>0){
           return instock.reserveStock(quantity);
        }
        return 0;
    }

    public int unreserveStock(String item, int quantity){
        StockItem instock=list.get(item);
        if ((instock!=null)&& quantity>0){
            return instock.unReserveStock(quantity);
        }
        return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }
    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }
    public Map<String, Double> PriceList(){
        Map<String, Double> prices= new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item: list.entrySet()){
            prices.put(item.getKey(),item.getValue().getPrice());
        }
        return Collections.unmodifiableMap((prices));
    }

    @Override
    public String toString() {
        String s="\n Stock List\n" ;
        double totalCost=0.0;
        for (Map.Entry<String,StockItem> item:list.entrySet()){
            StockItem stockItem=item.getValue();
            double itemValue=stockItem.getPrice()* stockItem.availableQuantity();
            s=s+stockItem+" . There are "+ stockItem.availableQuantity()+" in stock. ";
            s=s+"Value of Items:" +String.format("%.2f",itemValue)+"\n";
            totalCost+=itemValue;

        }
        return s+"Total stock value "+String.format("%.2f",totalCost);

    }



}
