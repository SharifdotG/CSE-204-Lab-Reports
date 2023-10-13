/*
 * @SharifdotG
 * @file: Sub.java
 * @description: Sub class for subtracting two numbers together using multilevel inheritance.
 * @date: 10-14-2023
 */

package MultilevelInheritance; // package for Sub class

/*
 * Sub class for subtracting two numbers together using multilevel inheritance.
 */
public class Sub extends Sum { // inheriting Sum class
    /*
     * sub method for subtracting two numbers together using multilevel inheritance.
     */
    public int sub(int a, int b) {
        return a - b; // return the difference of a and b
    }
}
