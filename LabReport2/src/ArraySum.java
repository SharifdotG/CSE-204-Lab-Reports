public class ArraySum {
    public void arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            // sum = sum + array[i];
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }
}
