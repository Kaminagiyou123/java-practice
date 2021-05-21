package com.company.Collection2;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock=0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock=0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInstock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price>0) {
            this.price = price;
        }
    }
    public void adjustStock(int quantity){
        int newQuantity= this.quantityStock+quantity;
        if (newQuantity>=0){
            this.quantityStock=newQuantity;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        String oName=(stockItem).getName();
        return this.name.equals(oName);
          }

    @Override
    public int hashCode() {
    return this.name.hashCode()+67;
    }

    @Override
    public int compareTo(StockItem o) {
        if (this==o) return 0;
        if (o!=null)  { return
            this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityStock=" + quantityStock +
                '}';
    }
}
