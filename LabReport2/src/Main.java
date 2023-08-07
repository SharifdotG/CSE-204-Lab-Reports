/* 
 * @author Sharif Md. Yousuf
 * @ID 22101128
 * @date 08/02/2021
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nArithmetic Operations");
        System.out.println("---------------------");
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        arithmeticOperations.addition(firstNumber, secondNumber);
        arithmeticOperations.subtraction(firstNumber, secondNumber);
        arithmeticOperations.multiplication(firstNumber, secondNumber);
        arithmeticOperations.division(firstNumber, secondNumber);
        arithmeticOperations.modulus(firstNumber, secondNumber);

        System.out.println("\nCircle");
        System.out.println("------");
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle();
        circle.area((float)radius);

        System.out.println("\nMinimum & Maximum between 4 numbers");
        System.out.println("-----------------------------------");
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        System.out.print("Enter third number: ");
        int third = scanner.nextInt();
        System.out.print("Enter fourth number: ");
        int fourth = scanner.nextInt();
        MinimumMaximum minimumMaximum = new MinimumMaximum();
        minimumMaximum.minimum(first, second, third, fourth);
        minimumMaximum.maximum(first, second, third, fourth);

        System.out.println("\nEven or Odd");
        System.out.println("-----------");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.evenOdd(number);

        System.out.println("\nLeap Year");
        System.out.println("---------");
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        LeapYear leapYear = new LeapYear();
        leapYear.isLeapYear(year);

        System.out.println("\nMultiplication Table");
        System.out.println("--------------------");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.multiplicationTable(n);

        System.out.println("\nFibonacci");
        System.out.println("----------");
        System.out.print("Enter a number: ");
        int fibonacciNumber = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(fibonacciNumber);

        System.out.println("\nArray Sum");
        System.out.println("---------");
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        ArraySum arraySum = new ArraySum();
        arraySum.arraySum(array);

        System.out.println("\nArray Minimum & Maximum");
        System.out.println("-----------------------");
        System.out.print("Enter array size: ");
        arraySize = scanner.nextInt();
        array = new int[arraySize];
        System.out.println("Enter array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        ArrayMinMax arrayMinMax = new ArrayMinMax();
        arrayMinMax.arrayMinMax(array);

        System.out.println("\nMatrix Transpose");
        System.out.println("----------------");
        System.out.print("Enter matrix row size: ");
        int rowSize = scanner.nextInt();
        System.out.print("Enter matrix column size: ");
        int columnSize = scanner.nextInt();
        int[][] matrix = new int[rowSize][columnSize];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        MatrixTranspose matrixTranspose = new MatrixTranspose();
        matrixTranspose.matrixTranspose(matrix);

        System.out.println("\nString Palindrome");
        System.out.println("-----------------");
        System.out.print("Enter a string: ");
        String string = scanner.next();
        StringPalindrome stringPalindrome = new StringPalindrome();
        stringPalindrome.stringPalindrome(string);

        scanner.close();
    }
}
