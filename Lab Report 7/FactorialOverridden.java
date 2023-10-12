/*
 * @SharifdotG
 * @file: FactorialOverridden.java
 * @description: Overridden class for calculating factorials
 * @date: 13-10-2023
 */

 /*
  * Overridden class for calculating factorials
  */
public class FactorialOverridden extends PrimeFactorial {
    /*
     * Overridden method to calculate the factorial of a number1
     */
    @Override
    /*
     * Concrete method to calculate the factorial of a number1
     */
    public void factorial() {
        /*
         * fact variable to store the factorial of the number1
         * number variable to store the number1 whose factorial is to be calculated
         */
        int fact = 1;
        int number = getNumber1();

        /*
         * In the for loop, i is initialized to 1 and incremented by 1
         * till it is less than or equal to number1 because factorial of a number1
         * is the product of all the numbers from 1 to that number1
         */
        for (int i = 1; i <= number; i++) {
            fact *= i; // Multiplying the fact variable by i and storing it in fact
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
