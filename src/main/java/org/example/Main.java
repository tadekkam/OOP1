package org.example;

import static org.example.MinutesToSeconds.convert;

public class Main {


    public static void main(String[] args) {


        boolean pythagoras = Pythagoras.isRightTriangleExc(3,4,5);
        System.out.println(pythagoras);

        boolean pythagorasError = Pythagoras.isRightTriangleExc(0,4,5);
        System.out.println(pythagorasError);

    }
}