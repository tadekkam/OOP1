package org.example;

import java.io.PrintStream;

public class Main {


    public static void main(String[] args) {

    /*
    Seat seat = new Seat(1,10);
    System.out.println(seat.seatStatus());
    Seat seatTwo = new Seat(1,10, true);
    System.out.println(seatTwo.seatStatus());
    seat.isOccupied = true;
    System.out.println(seat.seatStatus());

    Movie movieNew = new Movie("The Green Mile", "Frank", "Darabont", 181, 1999);
    movieNew.movieInfo();
    */

    TicketSeller employee = new TicketSeller("Tadeusz", "Kowalski",1993);
    Manager manager = new Manager("Szymon", "Kowalski",2000);

    System.out.println("Employee: ");
    System.out.println("Full name: " + employee.getFullName());
    System.out.println("Years of employment: " + employee.getYearsOfEmployment());
    System.out.println("Salary: " + employee.calculateMonthlySalary());

    System.out.println("Manager: ");
    System.out.println("Full name: " + manager.getFullName());
    System.out.println("Years of employment: " + manager.getYearsOfEmployment());
    System.out.println("Salary: " + manager.calculateMonthlySalary());

    manager.setBonus(800);
    System.out.println("Manager salary + new bonus: " + manager.calculateMonthlySalary());

    }
}