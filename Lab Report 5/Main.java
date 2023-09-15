/*
 * @SharifdotG
 * @file: Main.java
 * @description: Main class for CGPA Calculator
 * @date: 2021-05-15
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try { // Try block to catch any exception that occurs
            System.out.println("---------------------------------");
            System.out.println("The (Exception)al CGPA Calculator");
            System.out.println("---------------------------------");

            System.out.println();
            
            Scanner scanner = new Scanner(System.in); // Creating a Scanner object

            System.out.println("---------------------------------");

            /*
             * Inputting the User's Name and ID
             */
            System.out.print("Enter Your Name: ");
            String name = scanner.nextLine();

            int id;

            /*
             * Validating the ID input and throwing an exception if the input is invalid
             */
            while (true) {
                try {
                    System.out.print("Enter Your ID: ");
                    id = Integer.parseInt(scanner.nextLine());
                    break; // Breaking the loop if input is a valid integer
                } catch (NumberFormatException e) { // Catching the exception if input is not a valid integer
                    System.out.println("Invalid ID input. Please enter a valid integer.");
                    System.out.println("Please try again.");
                }
            }

            System.out.println("---------------------------------");

            /*
             * Creating a semesterGPA object and calling the collectGPAs() method
             */
            SemesterGPA semesterGPA = new SemesterGPA();
            semesterGPA.collectGPAs();

            double cgpa = semesterGPA.calculateCGPA();

            System.out.println("---------------------------------");

            /*
             * Printing the results
             */
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.printf("CGPA: %.2f\n", cgpa);

            System.out.println("---------------------------------");

            scanner.close();
        } catch (Exception e) { // Catching any other exception if it occurs
            System.out.println("---------------------------------");
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("Please try again.");
            System.out.println("---------------------------------");
            System.out.println();
        } finally { // Finally block to print a thank you message
            System.out.println("---------------------------------");
            System.out.println("Thank you for using The (Exception)al CGPA Calculator <3");
            System.out.println("---------------------------------");
        }
    }
}