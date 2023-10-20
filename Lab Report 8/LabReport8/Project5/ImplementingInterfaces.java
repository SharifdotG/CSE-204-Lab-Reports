package LabReport8.Project5;

public class ImplementingInterfaces implements Interfaces {
    @Override
    public void minMax(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("Minimum Number: " + number2
                    + "\nMaximum Number: " + number1
                    + "\n╰(*°▽°*)╯\n");
        } else {
            System.out.println("Minimum Number: " + number1
                    + "\nMaximum Number: " + number2
                    + "\n╰(*°▽°*)╯\n");
        }
    }

    @Override
    public void fibonacchi(int number) {
        System.out.print("Fibonacci Series of " + number + " terms: ");

        long firstNumber = 0, secondNumber = 1;

        for (int i = 2; i <= number; i++) {
            System.out.print(secondNumber + ", ");

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
