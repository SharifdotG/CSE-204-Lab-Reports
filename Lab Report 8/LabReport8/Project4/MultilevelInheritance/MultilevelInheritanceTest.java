package LabReport8.Project4.MultilevelInheritance;

public class MultilevelInheritanceTest extends Subtraction {
    public MultilevelInheritanceTest(int number1, int number2) {
        super(number1, number2);
    }

    public void multilevelInheritance() {
       System.out.println("Multilevel Inheritance! (❁´◡`❁))"
                + "\nSummation: " + sum()
                + "\nSubtraction: " + sub() + "\n");
    }
}
