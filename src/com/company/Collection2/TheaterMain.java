package com.company.Collection2;
// key learnings:

// use binary search to improve performance of a search in sorted list;
// perform an override for comparable to make sort work;
// what is a shadow copy;
// reverse and shuffle method;
// created a sortlist method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheaterMain {
    public static void main(String[] args) {
        Theater theater = new Theater("Olympian", 8, 12);
// a shallow copy,coping references of the same object;
//        List<Theater.Seat> seatCopy=new ArrayList<>((theater.seats));
//       //if one element changes. then both arrays change

        if (theater.reserveSeat(("D12"))) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println(" D12 already reserved");
        }
        if (theater.reserveSeat(("B13"))) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println(" B13 already reserved");
        }

        List<Theater.Seat> priceSeats=new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00",13.00));
        priceSeats.add(theater.new Seat("A00",13.00));
        Collections.sort(priceSeats,Theater.PRICE_ORDER);
        printList(priceSeats);




//        Collections.reverse(seatCopy);
//        System.out.println(("Printing seatCopy"));
//        printList(seatCopy);
//        System.out.println(("Printing theater.seats"));
//        printList(theater.seats);
//        // however if one array reverse, it does NOT affect the other array;
//
//        printList(seatCopy);
//        seatCopy.get(1).reserve();
//        System.out.println(seatCopy);
//        System.out.println("=============");
//        System.out.println(theater.seats);
//        System.out.println("=============");
//        Collections.reverse(seatCopy);
//        System.out.println(seatCopy);
//// depending on compareTo
//        Theater.Seat minSeat=Collections.min(seatCopy);
//        Theater.Seat maxSeat=Collections.max(seatCopy);
//
//        System.out.println("Min seat number is "+minSeat.getSeatNumber());
//        System.out.println("Min seat number is "+maxSeat.getSeatNumber());
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
////        List<Theater.Seat> newList=new ArrayList<>(theater.seats.size());
////        Collections.copy(newList,theater.seats);
//
//    }

    }
    public static void printList(List<Theater.Seat> list){
        for (Theater.Seat seat:list){
            System.out.println(seat.getSeatNumber()+" "+seat.getPrice());
        }
        System.out.println();
        System.out.println("=============");
    }
//    public static void sortList(List<? extends Theater.Seat> list){
//        for (int i=0;i<list.size()-1;i++){
//            for (int j=i+1;j<list.size();j++){
//                if (list.get(i).compareTo(list.get(j))>0){
//                    Collections.swap(list,i,j);
//            }
//            }
//        }
//    }

}
