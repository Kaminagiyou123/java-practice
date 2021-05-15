package com.company.Collection;

import java.util.*;

public class Theater {
    private final String theatherName;
    public List<Seat> seats=new ArrayList<Seat>();
    static final Comparator<Seat> PRICE_ORDER= new Comparator<Seat>(){
        @Override
        public int compare(Seat seat1, Seat seat2) {
           if (seat1.getPrice()<seat2.getPrice()){
               return -1;
           } else if (seat1.getPrice()>seat2.getPrice()){
               return 1;
            } else {
               return 0;
           }
        }
    };


    public Theater(String theatherName, int numRows, int seatsPerRow) {
        this.theatherName = theatherName;
        int lastRow='A'+(numRows-1);
        for (char row ='A'; row<=lastRow;row++){
           for (int seatNum=1; seatNum<=seatsPerRow;
            seatNum++){
               double price=12.00;
               if ((row<'D') && (seatNum>=4 && seatNum<=9)){
                   price=14;
               } else if (row>'F'||(seatNum<4||seatNum>9)){
                   price=7;
               }
               Seat seat= new Seat(row+String.format("%02d",seatNum),price);
               seats.add(seat);
           }
        }

    }

    public Theater(String theatherName, List<Seat> seats) {
        this.theatherName = theatherName;
        this.seats = seats;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat=new Seat(seatNumber,0);
        int foundSeat= Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat>=0){
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat "+seatNumber);
            return false;
        }

//        for (Seat seat:seats){
//            System.out.println(".");
//            if (seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat=seat;
//                System.out.println("found seat");
//
//            }
//        }
//        if (requestedSeat==null){
//            System.out.println("There is no seat "+seatNumber);
//            return false;
//        }
//
//        return requestedSeat.reserve();
    }

    //for testing
    public Collection<Seat> getSeats(){
       return seats;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved=false;

        public Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
            this.price=price;
        }
        public String getSeatNumber(){
            return this.seatNumber;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if (!this.reserved){
                this.reserved=true;
                System.out.println("Seat "+seatNumber+" reserved");
                return true;
            } else {
               return false;
            }
        }
        public boolean cancel(){
            if (this.reserved){
                this.reserved=false;
                System.out.println("Reservation of Seat "+seatNumber+"cancelled");
                return true;
            } else {
                return false;
            }
        }

        public boolean isReserved() {
            return reserved;
        }
    }
}
