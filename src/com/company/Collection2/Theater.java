package com.company.Collection2;

import java.util.*;

public class Theater {
    private final String theaterName;
    private final List<Seat> seats=new LinkedList<>();

    static final Comparator<Seat> PRICE_ORDER=new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice()<seat2.getPrice()){
                return -1;
            }
            if (seat1.getPrice()> seat2.getPrice()){
                return 1;
            }
            return 0;// if equal to 0 then based on order the element added to the list;
        }
    };

    public Theater(String theaterName, int numRows, int seatsPerRow ) {
        this.theaterName = theaterName;
        int lastRow='A'+numRows-1;
        for (char row='A';row<=lastRow; row++){
            for (int seatNum=1;seatNum<=seatsPerRow;seatNum++) {
                double price=12.00;
                if ((row<'D') && (seatNum>=4 && seatNum<=9)){
                    price=14.00;
                } else if (row>'F'|| (seatNum<4|| seatNum>9)){
                    price=7.00;
                }

                Seat seat= new Seat(row+String.format("%02d",seatNum),price);
                seats.add(seat);
            }
        }
    }
    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat=new Seat(seatNumber,0);
        int foundSeat= Collections.binarySearch(seats,requestedSeat,null);
        //if foundSeat==-1 then no item; otherwise returned the index in the list;
        if (foundSeat>=0){
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat "+seatNumber);
            return false;
        }

    }

    public Collection<Seat> getSeats(){
        for (Seat seat:seats){
            System.out.println(seat.getSeatNumber());
        }
        return seats;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved=false;


        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price=price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        public boolean reserve(){
            if (!this.reserved){
                this.reserved=true;
                System.out.println("Seat "+seatNumber+" reserved");
               return true;
            }
            return false;
        }
        public boolean cancel(){
            if (this.reserved){
                this.reserved=false;
                System.out.println("Reservation of  Seat "+seatNumber+ "cancelled");
                return true;
            }else {
                return false;
            }
        }

// need the override to sort the list first before the binary search
        @Override
        public int compareTo(Seat seats) {
            return this.seatNumber.compareTo(seats.getSeatNumber());
        }

    }

}
