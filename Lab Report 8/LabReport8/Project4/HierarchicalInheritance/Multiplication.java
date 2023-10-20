package LabReport8.Project4.HierarchicalInheritance;

public class Multiplication extends Summation {
    public Multiplication(int number1, int number2) {
        super(number1, number2);
    }

    public int mul() {
        return number1 * number2;
    }
}
