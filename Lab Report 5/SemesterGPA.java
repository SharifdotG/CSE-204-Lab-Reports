/*
 * @SharifdotG
 * @file: SemesterGPA.java
 * @description: SemesterGPA class for CGPA Calculator
 * @date: 2021-05-15
 */

import java.util.Scanner;

public class SemesterGPA { // This class is used to collect GPAs for each semester and calculate CGPA
    private double[] gpas;
    private Scanner scanner;

    public SemesterGPA() { // Constructor for SemesterGPA class
        gpas = new double[8]; // 8 is the number of semesters
        scanner = new Scanner(System.in);
    }

    public void collectGPAs() { // This method is used to collect GPAs for each semester
        System.out.println();
        System.out.println("---------------------------------");
        for (int i = 0; i < 8; i++) {
            try { // Try block to catch any exception that occurs
                System.out.print("Enter GPA for Semester No. " + (i + 1) + ": ");
                double gpa = scanner.nextDouble();
                CGPACalculation.validateGPA(gpa); // Validating the GPA
                gpas[i] = gpa; // Storing the GPA
            } catch (UserInputException e) {
                System.out.println("Invalid GPA input: " + e.getMessage());
                System.out.println("Please try again.");
                i--; // Repeat the same semester
            } catch (Exception e) {
                System.out.println("Invalid GPA input. The GPA must be a number.");
                scanner.nextLine(); // Clear the invalid input
                i--; // Repeat the same semester
            }
        }
        System.out.println("---------------------------------");
        System.out.println();
    }    

    public double calculateCGPA() { // This method is used to calculate CGPA
        return CGPACalculation.calculateCGPA(gpas);
    }
}
