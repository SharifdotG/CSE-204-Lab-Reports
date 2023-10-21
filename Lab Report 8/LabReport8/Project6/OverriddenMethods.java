package LabReport8.Project6;

public class OverriddenMethods extends Methods {
    @Override
    public void reverseNumber(int number) {
        int reversedNumberResult = 0;

        System.out.println("Original Number: " + number + " (‾◡◝)");

        while (number != 0) {
            int digit = number % 10;
            reversedNumberResult = reversedNumberResult * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumberResult + " (｡･∀･)ﾉﾞ\n");
    }

    @Override
    public void fibonacci(int number) {
        System.out.println("Fibonacci Series of " + number + " terms:");

        long firstNumber = 0, secondNumber = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(firstNumber + ", ");

            if (i % 5 == 0) {
                System.out.println();
            }

            long nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        System.out.println("\n(〃￣︶￣)人(￣︶￣〃)\n");
    }

    @Override
    public void digitSum(int number) {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Digit Sum of " + number + ": " + sum + "\n(≧∇≦)ﾉ");
    }
}
