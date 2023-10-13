/*
 * @SharifdotG
 * @file: Sum.java
 * @description: Sum class for adding two numbers together.
 * @date: 10-14-2023
 */

package HierarchicalInheritance; // package for Sum class

/*
 * Sum class for adding two numbers together.
 */
public class HierarchicalInheritance {
    /*
     * sum method for adding two numbers together.
     */
    public void hierarchicalInheritance(int a, int b) {
        /*
         * Creating objects for Sum, Sub, and Mul classes to use their methods.
         */
        Sum summation = new Sum();
        Sub subtraction = new Sub();
        Mul multiplication = new Mul();
        
        /*
         * Printing the results of the methods from Sum, Sub, and Mul classes using hierarchical inheritance.
         */
        System.out.println("The Summation of " + a + " and " + b + " is " + summation.sum(a, b) + ".");
        System.out.println("The Subtraction of " + a + " and " + b + " is " + subtraction.sub(a, b) + ".");
        System.out.println("The Multiplication of " + a + " and " + b + " is " + multiplication.mul(a, b) + ".");
    }
}