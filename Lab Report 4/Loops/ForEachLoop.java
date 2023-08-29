/*
 * Author: Sharif Md. Yousuf
 * ID: 22101128
 * 
 * For each loop demanstration by printing numbers from 1 to 128
 */

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = new int[128];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
