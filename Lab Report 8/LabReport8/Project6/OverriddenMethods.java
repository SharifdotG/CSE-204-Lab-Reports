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

        System.out.println("Reversed Number: " + reversedNumberResult + " (｡･∀･)ﾉﾞ");
    }
}
