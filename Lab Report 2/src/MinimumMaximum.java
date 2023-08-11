public class MinimumMaximum {
    public void minimum(int a, int b, int c, int d) {
        if (a < b && a < c && a < d) {
            System.out.println("Minimum: "+ a);
        } else if (b < a && b < c && b < d) {
            System.out.println("Minimum: "+ b);
        } else if (c < a && c < b && c < d) {
            System.out.println("Minimum: "+ c);
        } else {
            System.out.println("Minimum: "+ d);
        }
    }

    public void maximum(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            System.out.println("Maximum: "+ a);
        } else if (b > a && b > c && b > d) {
            System.out.println("Maximum: "+ b);
        } else if (c > a && c > b && c > d) {
            System.out.println("Maximum: "+ c);
        } else {
            System.out.println("Maximum: "+ d);
        }
    }
}
