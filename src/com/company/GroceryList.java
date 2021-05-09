package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList=new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have" + groceryList.size()+" items in your grocery list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+" ."+ groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String item, String newItem){
        int position=findItem(item);
        if (position>0) {
            groceryList.set(position, newItem);

            System.out.println("Grocery item " + item + " has been modified to " + newItem);
        } else {
            System.out.println("Grocery Item "+ item +" couldn't be found." );
        }
    }

    public void removeGroceryItem(String item){

        int position=findItem(item);
        if (position>0) {
            groceryList.remove(item);
            System.out.println("Grocery item " +item+ "Has been Removed");
        } else {
            System.out.println("Grocery Item "+ item +" couldn't be found." );
        }
    }

    private int findItem(String searchItem) {
//        boolean exits=groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return position;
        }
        return -1;
    }

    public boolean onFile(String item){
        return groceryList.contains(item);
    }
    public static void processArrayList(){
        ArrayList<String> newArray= new ArrayList<String>();



    }
}
