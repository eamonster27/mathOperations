package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a total of two numbers, one at a time: ");

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        double operand1 = Double.parseDouble(num1);
        double operand2 = Double.parseDouble(num2);

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);


    }
    public static void showResults(double sum, double difference, double division, double multiplication, double remainder) {
        System.out.print("Sum: " + sum + '\n');
        System.out.print("Difference: " + difference + '\n');
        System.out.print("Division: " + division + '\n');
        System.out.print("Multipliation: " + multiplication + '\n');
        System.out.print("Remainder: " + remainder + '\n');
    }

}
