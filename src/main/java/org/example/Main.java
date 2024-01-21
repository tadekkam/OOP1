package org.example;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
    Seat seat = new Seat(1,10);
    System.out.println(seat.seatStatus());
    Seat seatTwo = new Seat(1,10, true);
    System.out.println(seatTwo.seatStatus());
    seat.isOccupied = true;
    System.out.println(seat.seatStatus());

    Movie movieNew = new Movie("The Green Mile", "Frank", "Darabont", 181, 1999);
    movieNew.movieInfo();

}
}