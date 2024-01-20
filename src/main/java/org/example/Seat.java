package org.example;

public class Seat {

    private final int number;
    private final int numberRow;
    boolean isOccupied;
    public Seat (int number, int numberRow)
    {
        this.number = number;
        this.numberRow = numberRow;
        this.isOccupied = false;
    }

    public Seat (int number, int numberRow, boolean occupied)
    {
        this.number = number;
        this.numberRow = numberRow;
        this.isOccupied = occupied;
    }

    String SeatStatus()
    {
        return ("Number: " + number + " NumberRow: " + numberRow + " Occupied: " + isOccupied);
    }

}
