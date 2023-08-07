public class Circle {
    public void diameter(float r) {
        System.out.println("Diameter: "+ (2 * r));
    }

    public void circumference(float r) {
        System.out.println("Circumference: "+ (2 * Math.PI * r));
    }

    public void area(float r) {
        System.out.println("Area: "+ (Math.PI * r * r));
    }
}
