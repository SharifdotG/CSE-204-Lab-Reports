/*
 * @autor: Sharif Md. Yousuf
 * @ID: 22101128
 */

public class LocalVariableExample {
    public void calculateSum() {
        int num1 = 5; // Local variable
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.calculateSum();
    }
}