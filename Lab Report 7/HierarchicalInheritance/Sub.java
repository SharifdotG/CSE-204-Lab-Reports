/*
 * @SharifdotG
 * @file: Sub.java
 * @description: Sub class for subtracting two numbers together using hierarchical inheritance.
 * @date: 10-14-2023
 */

package HierarchicalInheritance;

/*
 * Sub class for subtracting two numbers together using hierarchical inheritance.
 */
public class Sub extends Sum { // inheriting Sum class
    /*
     * sub method for subtracting two numbers together using hierarchical inheritance.
     */
    public int sub(int a, int b) {
        return a - b; // return the difference of a and b
    }
}
