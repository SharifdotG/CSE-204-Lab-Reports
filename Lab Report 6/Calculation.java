/*
 * @SharifdotG
 * @file: Calculation.java
 * @description: Calculation class for Project 2
 * @date: 22-9-2023
 */

public class Calculation extends Encapsulation {
    Encapsulation encapsulation = new Encapsulation();

    public void magicNumber1(int number1) {
        long factorial = 1;

        for (int i = 1; i <= number1; i++) factorial *= i;

        if (number1 % 2 == 0) System.out.println("Even & " + factorial);
        else System.out.println("Odd & " + factorial);
    }

    public void magicNumber2(double number2, int id) {
        System.out.println(((long) (number2 * number2)) + id);
    }
}
