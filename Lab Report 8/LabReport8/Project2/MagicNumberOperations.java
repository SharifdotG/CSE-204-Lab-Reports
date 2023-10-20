package LabReport8.Project2;

public class MagicNumberOperations extends GetterSetterMethods {

    public void isEvenOrOdd(int number1) {
        if (number1 % 2 == 0) {
            System.out.print("The First Magic number is an Even number ");
        } else {
            System.out.print("The First Magic number is an Odd number ");
        }
    }

    public void factorial(int number1) {
        long factorialResult = 1;

        for (int i = 1; i <= number1; i++) {
            factorialResult *= i;
        }

        System.out.print("and the factorial is " + factorialResult + "! []~(￣▽￣)~*");
    }

    public void magicNumber2(double number2) {
        long magicNumber2 = ((long) (number2 * number2) + getID());

        System.out.print("The Second Magic number is " + magicNumber2 + "! ||ヽ(*￣▽￣*)ノミ|Ю");
    }
}
