package org.example;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
    Seat seat = new Seat(1,10);

    System.out.println(seat.SeatStatus());

    Seat seatTwo = new Seat(1,10, true);

    System.out.println(seatTwo.SeatStatus());

    seat.isOccupied = true;

    System.out.println(seat.SeatStatus());
}



}