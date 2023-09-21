/*
 * @SharifdotG
 * @file: Main.java
 * @description: Main class for CGPA Calculator
 * @date: 15-9-2023
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Start of Project 1
         */
        System.out.println("---------------------------------");
        System.out.println("            Project 1            ");
        System.out.println("---------------------------------");
        System.out.println();

        Scanner scanner = new Scanner(System.in); // Creating a Scanner object


        try { // Try block to catch any exception that occurs
            System.out.println("The (Exception)al CGPA Calculator");

            System.out.println();

            System.out.println("---------------------------------");

            /*
             * Inputting the User's Name and ID
             */
            System.out.print("Enter Your Name: ");
            String nameCGPA = scanner.nextLine();

            int idCGPA;

            /*
             * Validating the ID input and throwing an exception if the input is invalid
             */
            while (true) {
                try {
                    System.out.print("Enter Your ID: ");
                    idCGPA = Integer.parseInt(scanner.nextLine());
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
            System.out.println("Name: " + nameCGPA);
            System.out.println("ID: " + idCGPA);
            System.out.printf("CGPA: %.2f\n", cgpa);

            System.out.println("---------------------------------");
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
        /*
         * End of Project 1
         */

        /*
         * Start of Project 2
         */
        System.out.println("---------------------------------");
        System.out.println("            Project 2            ");
        System.out.println("---------------------------------");
        System.out.println();

        Encapsulation encapsulation = new Encapsulation();
        Calculation calculation = new Calculation();

        System.out.print("Enter Your Name: ");
        encapsulation.setName(scanner.nextLine());
        
        System.out.print("Enter Your UID: ");
        encapsulation.setId(scanner.nextInt());

        System.out.print("Enter Your University: ");
        encapsulation.setUniversity(scanner.next());

        System.out.println("Enter Two Numbers:");
        System.out.println();

        System.out.print("Enter Your First Number: ");
        encapsulation.setNumber1(scanner.nextInt());

        System.out.print("Enter Your Second Number: ");
        encapsulation.setNumber2(scanner.nextDouble());

        System.out.println("Your Name: " + encapsulation.getName());
        System.out.println("Your UID: " + encapsulation.getId());
        System.out.println("Your University: " + encapsulation.getUniversity());
        System.out.println("1st Magic Number: ");
        calculation.magicNumber1(encapsulation.getNumber1());
        System.out.println("2nd Magic Number: ");
        calculation.magicNumber2(encapsulation.getNumber2(), encapsulation.getId());

        scanner.close();
    }
}