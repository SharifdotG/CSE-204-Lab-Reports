package LabReport8.Project5;

public class ImplementingInterfaces implements SumInterface, SubInterface {
    @Override
    public void sum(int number1, int number2) {
        System.out.println("This Output is from the First Interface!"
                + "\n" + "The Summation of " + number1 + " & " + number2
                + ": " + (number1 + number2) + "! (┬┬﹏┬┬)\n");
    }

    @Override
    public void sub(int number1, int number2) {
        System.out.println("This Output is from the Second Interface!"
                + "\n" + "The Subtraction of " + number1 + " & " + number2
                + ": " + (number1 - number2) + "! (┬┬﹏┬┬)");
    }
}
