package LabReport8.Project1;

import java.util.Scanner;

public class GPAOperations {
    public double[] gpas = new double[8];
    Scanner scanner = new Scanner(System.in);

    public void gpaCollection() {
        System.out.println("             -------             ");
        System.out.println("GPA Collection: []~(￣▽￣)~*");
        System.out.println("Enter your GPA Carefully! O(∩_∩)O");
        System.out.println();

        for (int i = 0; i < 8; i++) {
            try {
                System.out.print("Your obtained GPA for Semester No." + (i + 1) + ": ");
                double gpa = scanner.nextDouble();
                validateGPA(gpa);
                gpas[i] = gpa;
            } catch (UserDefinedException e) {
                System.out.println(e.getMessage());

                i--;
            } catch (Exception e) {
                System.out.println("Your GPA must be a Number! (；′⌒`)");
                System.out.println("Please try again! (★‿★)");
                System.out.println();
                scanner.nextLine();

                i--;
            }
        }

        System.out.println("GPA Collection is Completed! (～￣▽￣)～");
        System.out.println("             -------             ");
        System.out.println();
    }

    public void validateGPA(double gpa) throws UserDefinedException {
        if (gpa < 0.0) {
            throw new UserDefinedException("""
                    How come your GPA is negative! .·´¯`(>▂<)´¯`·.
                    Please try again! o(*￣▽￣*)ブ
                    """);
        } else if (gpa > 4.0) {
            throw new UserDefinedException("""
                    How come your GPA is greater than 4.0! (⊙_⊙)？
                    Please try again! (❁´◡`❁)
                    """);
        }
    }

    public double cgpaCalculation(double[] gpas) {
        double sum = 0;

        for (double gpa : gpas) {
            sum += gpa;
        }

        return sum / gpas.length;
    }

    public double cgpaResult() {
        return cgpaCalculation(gpas);
    }
}
