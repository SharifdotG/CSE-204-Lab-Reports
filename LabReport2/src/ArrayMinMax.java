public class ArrayMinMax {
    public void arrayMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
