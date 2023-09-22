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
        System.out.println("*********************************");
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
            System.out.println();
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
            System.out.println("*********************************");
            System.out.println();
            System.out.println();
        }
        /*
         * End of Project 1
         */

        /*
         * Start of Project 2
         */
        System.out.println("*********************************");
        System.out.println("---------------------------------");
        System.out.println("            Project 2            ");
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Creating objects of the Encapsulation and Calculation classes
         */
        Encapsulation encapsulation = new Encapsulation();
        Calculation calculation = new Calculation();

        System.out.println("---------------------------------");

        /*
         * Inputting the User's Name, UID, University, and two numbers
         */
        System.out.print("Enter Your Name: ");
        encapsulation.setName(scanner.nextLine()); // Using nextLine() to read the entire line
        
        System.out.print("Enter Your UID: ");
        encapsulation.setId(scanner.nextInt()); // Using nextInt() to read the integer

        System.out.print("Enter Your University: ");
        encapsulation.setUniversity(scanner.next()); // Using next() to read the first word

        System.out.println("Enter Two Numbers:");

        System.out.print("First Number: ");
        encapsulation.setNumber1(scanner.nextInt()); // Using nextInt() to read the integer

        System.out.print("Second Number: ");
        encapsulation.setNumber2(scanner.nextDouble()); // Using nextDouble() to read the double

        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("---------------------------------");

        /*
         * Printing the results
         */
        System.out.println("Your Name: " + encapsulation.getName());
        System.out.println("Your UID: " + encapsulation.getId());
        System.out.println("Your University: " + encapsulation.getUniversity());
        System.out.print("1st Magic Number: ");
        calculation.magicNumber1(encapsulation.getNumber1());
        System.out.print("2nd Magic Number: ");
        calculation.magicNumber2(encapsulation.getNumber2(), encapsulation.getId());

        System.out.println("---------------------------------");

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("   The Project 2 is completed!   ");
        System.out.println("---------------------------------");
        System.out.println("*********************************");

        scanner.close();
        /*
         * End of Project 2
         */
    }
}