package javaassignment;

import java.util.Scanner;

public class JavaMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = input.nextInt();

                    System.out.println(checkNumberType(number));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    int number1 = input.nextInt();

                    System.out.print("Enter second number: ");
                    int number2 = input.nextInt();

                    int result = calculateSum(number1, number2);

                    System.out.println("Sum = " + result);
                    break;

                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while (choice != 5);

        input.close();
    }

    //Prints numbers starting from 10 and counting down to 1.

    public static void printNumbersDescending() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    //Displays numbers from 1 to 10 and identifies each one as even or odd.

    public static void printEvenOrOdd() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }

    /*
     * Checks whether the entered number is positive, negative, or zero.
     *
     * @param number an integer such as 7, 0, or -6.
     * @return Positive if the number is greater than zero,
     *         Negative if the number is less than zero,
     *         or Zero if the number equals zero.
     */
    public static String checkNumberType(int number) {

        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * Adds two numbers together to calculate their total.
     *
     * @param number1 the first number, such as 20.
     * @param number2 the second number, such as 40.
     * @return the sum of the two numbers = 60 .
     */
    public static int calculateSum(int number1, int number2) {

        int sum = number1 + number2;

        return sum;
    }
}
