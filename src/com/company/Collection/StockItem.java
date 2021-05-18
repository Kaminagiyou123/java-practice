package com.company.Collection;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityInstock=0;
    private int reserved=0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInstock=0;
    }

    public StockItem(String name, double price, int quantityInstock) {
        this.name = name;
        this.price = price;
        this.quantityInstock = quantityInstock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInstock-reserved;
    }

    public void setPrice(double price) {
        if (price>=0) {
            this.price = price;
        }
    }
    public void adjustStock(int quantity){
        int newQuantity= this.quantityInstock+quantity;
        if (newQuantity>=0){
            this.quantityInstock=newQuantity;
        }
    }
    public int reserveStock(int quantity){
        if (quantity>0 && quantity<=quantityInstock){
            reserved+=quantity;
            return quantity;
        }
        return 0;
    }
    public int unReserveStock(int quantity){
        if (quantity>0 && quantity<=reserved){
            reserved-=quantity;
            return quantity;
        }
        return 0;
    }
    public int finalizeStock(int quantity){
        if (quantity<=reserved){
            quantityInstock-=quantity;
            reserved-=quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StockItem stockItem = (StockItem) obj;
        String objName=((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+31;
    }

    @Override
    public int compareTo(StockItem o) {
//        System.out.println("Entering StockItem.compareTo");
        if (this==o){
            return 0;
        }
        if (o!=null) {
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name+" : "+this.price+" ,Reserved"+ this.reserved;
    }
}
