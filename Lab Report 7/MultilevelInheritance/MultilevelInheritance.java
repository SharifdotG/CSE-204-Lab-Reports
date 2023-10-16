/*
 * @SharifdotG
 * @file: MultilevelInheritance.java
 * @description: MultilevelInheritance class for adding and subtracting two numbers together using multilevel inheritance.
 * @date: 10-14-2023
 */

package MultilevelInheritance; // package for MultilevelInheritance class

/*
 * MultilevelInheritance class for adding and subtracting two numbers together using multilevel inheritance.
 */
public class MultilevelInheritance extends Sub { // inheriting Sub class
    /*
     * multilevelInheritance method for adding and subtracting two numbers together using multilevel inheritance.
     */
    public void multilevelInheritance(int a, int b) {
        MultilevelInheritance multiLevelInherit = new MultilevelInheritance(); // create an object of MultilevelInheritance class

        /*
         * Print the summation and subtraction of a and b.
         */
        System.out.println("The Summation of " + a + " and " + b + " is " + multiLevelInherit.sum(a, b) + ".");
        System.out.println("The Subtraction of " + a + " and " + b + " is " + multiLevelInherit.sub(a, b) + ".");
    }
}