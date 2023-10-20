package LabReport8.Project3;

public class MethodOverriding extends Abstraction {
    @Override
    public void factorial() {
        int number = getNumber1();
        long factorialResult = 1;

        for (int i = 1; i <= number; i++) {
            factorialResult *= i;
        }

        System.out.println("This Output is from an Abstract Method!"
                + "\nThe Factorial is " + factorialResult + "! (*Φ皿Φ*)");
    }
}
