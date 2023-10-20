package LabReport8.Project4.SingleInheritance;

public class SingleInheritanceTest extends Summation {
    public SingleInheritanceTest(int number1, int number2) {
        super(number1, number2);
    }

    public void singleInheritance() {
        System.out.println("Single Inheritance! O(∩_∩)O"
                + "\nSummation: " + sum());
    }
}
