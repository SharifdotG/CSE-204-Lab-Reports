/*
 * @SharifdotG
 * @file: Mul.java
 * @description: Mul class for multiplying two numbers together using hierarchical inheritance.
 * @date: 10-14-2023
 */

package HierarchicalInheritance; // package for Mul class

/*
 * Mul class for multiplying two numbers together using hierarchical inheritance.
 */
public class Mul extends Sum { // inheriting Sum class
    /*
     * mul method for multiplying two numbers together using hierarchical inheritance.
     */
    public int mul(int a, int b) {
        return a * b; // return the product of a and b
    }
}
