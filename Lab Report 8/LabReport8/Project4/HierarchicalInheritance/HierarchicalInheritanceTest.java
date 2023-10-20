package LabReport8.Project4.HierarchicalInheritance;

import LabReport8.Project4.MultilevelInheritance.Subtraction;

public class HierarchicalInheritanceTest {
    public int number1, number2;

    public HierarchicalInheritanceTest(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void hierarchicalInheritance() {
        Subtraction subtraction = new Subtraction(number1, number2);
        Multiplication multiplication = new Multiplication(number1, number2);

        System.out.println("Hierarchical Inheritance! (￣o￣) . z Z)"
                + "\nSummation: " + subtraction.sum() // multiplication.sum() will also work!
                + "\nSubtraction: " + subtraction.sub()
                + "\nMultiplication: " + multiplication.mul());
    }
}
