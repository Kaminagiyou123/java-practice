package com.company.Collection2;

public class StockMain {
    private static StockList stockList= new StockList();
    public static void main(String[] args) {
        StockItem temp= new StockItem("bread",0.86,100);
        stockList.addStock(temp);
        temp=new StockItem("cake",1.10,7);
        stockList.addStock(temp);
        temp=new StockItem("car",12.50,2);
        stockList.addStock(temp);
        temp=new StockItem("chair",62,10);
        stockList.addStock(temp);
        temp=new StockItem("cup",0.5,200);
        stockList.addStock(temp);
        temp=new StockItem("cup",0.45,7);
        stockList.addStock(temp);
        temp=new StockItem("door",72.95,4);
        stockList.addStock(temp);
        temp=new StockItem("juice",2.5,36);
        stockList.addStock(temp);
        temp=new StockItem("phone",96.99,35);
        stockList.addStock(temp);
        temp=new StockItem("towel",2.40,80);
        stockList.addStock(temp);
        temp=new StockItem("vase",8.76,40);
        stockList.addStock(temp);

        System.out.println(stockList.toString());

        for (String s: stockList.Items().keySet()){
            System.out.println(s);
        }



    }
}
