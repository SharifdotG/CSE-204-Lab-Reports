package LabReport8.Project4.MultilevelInheritance;

public class Subtraction extends Summation {
    public Subtraction(int number1, int number2) {
        super(number1, number2);
    }

    public int sub() {
        return number1 - number2;
    }
}
