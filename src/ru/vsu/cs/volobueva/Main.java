package ru.vsu.cs.volobueva;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        final TestCase test = new TestCase();

        if (test.tests()) {
            System.out.println("the program is correct");

            System.out.print("input x: ");
            double x = readVariable();

            System.out.print("input y: ");
            double y = readVariable();

            printColorForPoint(x,y);
        }
    }

    static double readVariable() {
        Scanner scanner = new Scanner(System.in);
        double variable = scanner.nextDouble();

        if (Math.abs(variable) > 10) {
            System.out.println("Error: out of range. By the condition variable = [-10;10].");
            System.out.print("Try again: ");
            variable = readVariable();
        }
        return variable;
    }

    static void printColorForPoint(double x, double y) {
        final Picture picture = new Picture(new Circle(-3,-3,4), new HorizontalParabola(2,3,-1),
                new HorizontalParabola(-3,-3,-0.25), new HorizontalParabola(-6,-6,1));

        System.out.printf("( %1$.1f, %2$.1f) -> %3$S%n", x, y, picture.getColor(x, y));
    }
}