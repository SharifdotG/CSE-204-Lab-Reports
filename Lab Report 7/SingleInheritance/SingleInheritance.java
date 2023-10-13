/*
 * @SharifdotG
 * @file: SingleInheritance.java
 * @description: SingleInheritance class for adding two numbers together using single inheritance.
 * @date: 10-14-2023
 */

package SingleInheritance; // package for SingleInheritance class

/*
 * SingleInheritance class for adding two numbers together using single inheritance.
 */
public class SingleInheritance extends Sum { // inheriting Sum class
    /*
     * singleInheritance method for adding two numbers together using single inheritance.
     */
    public void singleInheritance(int a, int b) {
        SingleInheritance singleInherit = new SingleInheritance(); // create an object of SingleInheritance class
        
        System.out.println("The Summation of " + a + " and " + b + " is " + singleInherit.sum(a, b) + "."); // print the sum of a and b
    }
}

