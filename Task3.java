package ru.vsu.cs.volobueva;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        if (test.tests()) {
            System.out.println("the program is correct");

            System.out.print("input x: ");
            double x = readVariable();

            System.out.print("input y: ");
            double y = readVariable();

            printColorForPoint(x,y);
        }
    }

    static final Picture picture = new Picture();
    static final TestCase test = new TestCase();

    static double readVariable() {
        Scanner scanner = new Scanner(System.in);
        double variable = scanner.nextDouble();

        if (Math.abs(variable) > 10) {
            System.out.println("Error: out of range");
            System.exit(1);
        }
        return variable;
    }

    public static void printColorForPoint(double x, double y){
        System.out.printf("( %1$.1f, %2$.1f) -> %3$S%n", x, y, picture.getColor(x, y));
    }
}