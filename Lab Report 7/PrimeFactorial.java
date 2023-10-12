/*
 * @SharifdotG
 * @file: PrimeFactorial.java
 * @description: Class for Prime Check and Calculating Factorials
 * @date: 13-10-2023
 */

/*
 * Abstract class for PrimeFactorial for Lab Report 7
 */
public abstract class PrimeFactorial extends Encapsulation {
    /*
     * Concrete method to check if a number1 is prime or not
     */
    public void prime() {
        /*
         * Flag variable to check if the number1 is prime or not
         * 0 means prime
         * 1 means not prime
         * 
         * number variable to store the number1 to be checked for prime
         */
        int flag = 0;
        int number = getNumber1();

        /*
         * If the number1 is 0 or 1, it is not prime by definition
         */
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number");
        } else {
            /*
             * In the for loop, i is initialized to 2 and incremented by 1
             * till it is less than or equal to number1 / 2 because number1 is not
             * divisible by any number1 greater than its half except itself and 1
             */
            for (int i = 2; i <= number / 2; i++) {
                /*
                 * If the number1 is divisible by any number1 between 2 and number1 / 2,
                 * it is not prime
                 * 
                 * The flag is set to 1 and the loop is broken
                 */
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number");
                    flag = 1;
                    break;
                }
            }

            /*
             * If the flag is 0, the number1 is prime
             */
            if (flag == 0) {
                System.out.println(number + " is a prime number");
            }
        }
    }

    /*
     * Abstract method to calculate the factorial of a number1
     */
    public abstract void factorial();
}
