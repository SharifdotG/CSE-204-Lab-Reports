/*
 * @SharifdotG
 * @file: Calculation.java
 * @description: Calculation class for Project 2
 * @date: 22-9-2023
 */

public class Calculation extends Encapsulation {
    /*
     * Method to calculate the factorial of a number and check if it is even or odd
     */
    public void magicNumber1(int number1) {
        long factorial = 1;

        for (int i = 1; i <= number1; i++) factorial *= i; // Calculating the factorial

        /*
         * Checking if the number is even or odd
         */
        if (number1 % 2 == 0) System.out.println("Even & " + factorial);
        else System.out.println("Odd & " + factorial);
    }

    /*
     * Method to calculate the square of a number and add the ID to it
     */
    public void magicNumber2(double number2, int id) {
        System.out.println(((long) (number2 * number2)) + id); // Casting the square of the number to a long
    }
}
