/*
 * @SharifdotG
 * @file: Main.java
 * @description: Main class for CGPA Calculator
 * @date: 10-14-2023
 */

import java.util.Scanner;

import HierarchicalInheritance.HierarchicalInheritance;
import MultilevelInheritance.MultilevelInheritance;
import SingleInheritance.SingleInheritance;

public class Main {
    public static void main(String[] args) {
        /*
         * Disclaimer
         */
        System.out.println("*********************************");
        System.out.println("---------------------------------");
        System.out.println("          # Disclaimer #         ");
        System.out.println("  This program is created by me  ");
        System.out.println("   Sharif Md. Yousuf (22101128)  ");
        System.out.println("             -------             ");
        System.out.println("  I hold rights to this program  ");
        System.out.println("If you use any part of this code,");
        System.out.println("  please give proper credits <3  ");
        System.out.println("             -------             ");
        System.out.println("    This program is created for  ");
        System.out.println("    For the CSE 204: Java Lab    ");
        System.out.println("             -------             ");
        System.out.println("        Course Instructor:       ");
        System.out.println("    Sk. Tanzir Mehedi Shawon.    ");
        System.out.println("Lecturer, Department of CSE, UAP.");
        System.out.println("---------------------------------");
        System.out.println("*********************************");
        System.out.println();

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

            /*
             * Inputting the User's Name and ID
             */
            System.out.println("---------------------------------");
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
                    System.out.println();
                    System.out.println("Invalid ID input. Please enter a valid integer.");
                    System.out.println("Please try again.");
                    System.out.println();
                }
            }

            System.out.println("---------------------------------");
            System.out.println();

            /*
             * Creating a semesterGPA object and calling the collectGPAs() method
             */
            SemesterGPA semesterGPA = new SemesterGPA();
            semesterGPA.collectGPAs();

            double cgpa = semesterGPA.calculateCGPA();

            /*
             * Printing the results
             */
            System.out.println("---------------------------------");
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

        /*
         * Inputting the User's Name, UID, University, and two numbers
         */
        System.out.println("---------------------------------");
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

        /*
         * Printing the results
         */
        System.out.println("---------------------------------");
        System.out.println("Your Name: " + encapsulation.getName());
        System.out.println("Your UID: " + encapsulation.getId());
        System.out.println("Your University: " + encapsulation.getUniversity());

        System.out.println();

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
        System.out.println();
        System.out.println();
        /*
         * End of Project 2
         */

        /*
         * Start of Project 3
         */
        System.out.println("*********************************");
        System.out.println("---------------------------------");
        System.out.println("            Project 3            ");
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Abstract Class and Method
         */
        System.out.println("---------------------------------");
        System.out.println("    Abstract Class and Method    ");
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Creating an object of the FactorialOverridden class
         */
        FactorialOverridden factorialOverridden = new FactorialOverridden();

        /*
         * Inputing the first number
         */
        System.out.println("---------------------------------");
        System.out.print("Enter 1st Number (Inherited from Project 2): ");
        factorialOverridden.setNumber1(scanner.nextInt()); // Using nextInt() to read the integer
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Printing the results
         */
        System.out.println("---------------------------------");
        System.out.println("The 1st Number is " + factorialOverridden.getNumber1() + "!");
        System.out.println();
        
        System.out.println("(From Concrete Method)");
        factorialOverridden.prime(); // Calling the prime() method
        System.out.println();

        System.out.println("(From Abstract Method)");
        factorialOverridden.factorial(); // Calling the factorial() method
        System.out.println();

        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("---------------------------------");
        System.out.println("   The Project 3 is completed!   ");
        System.out.println("---------------------------------");
        System.out.println("*********************************");
        System.out.println();
        System.out.println();
        /*
         * End of Project 3
         */

        /*
         * Start of Project 4
         */

        System.out.println("*********************************");
        System.out.println("---------------------------------");
        System.out.println("            Project 4            ");
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Types of Inheritance
         */
        System.out.println("---------------------------------");
        System.out.println("       Types of Inheritance      ");
        System.out.println("---------------------------------");
        System.out.println();
        
        /*
         * Inputing the first and second number
         */
        System.out.println("---------------------------------");
        System.out.print("Enter the 1st Number: ");
        int number1 = scanner.nextInt(); // Using nextInt() to read the integer
        System.out.print("Enter the 2nd Number: ");
        int number2 = scanner.nextInt(); // Using nextInt() to read the integer
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Single Inheritance
         */
        System.out.println("---------------------------------");
        System.out.println("       Single Inheritance        ");
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Creating an object of the SingleInheritance class
         */
        SingleInheritance singleInheritance = new SingleInheritance();

        /*
         * Printing the results
         */
        System.out.println("---------------------------------");
        singleInheritance.singleInheritance(number1, number2); // Calling the singleInheritance() method
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Multilevel Inheritance
         */
        System.out.println("---------------------------------");
        System.out.println("      Multilevel Inheritance     ");
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Creating an object of the MultilevelInheritance class
         */
        MultilevelInheritance multilevelInheritance = new MultilevelInheritance();
        
        /*
         * Printing the results
         */
        System.out.println("---------------------------------");
        multilevelInheritance.multilevelInheritance(number1, number2); // Calling the multilevelInheritance() method
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Hierarchical Inheritance
         */
        System.out.println("---------------------------------");
        System.out.println("     Hierarchical Inheritance    ");
        System.out.println("---------------------------------");
        System.out.println();

        /*
         * Creating an object of the HierarchicalInheritance class
         */
        HierarchicalInheritance hierarchicalInheritance = new HierarchicalInheritance();
        
        /*
         * Printing the results
         */
        System.out.println("---------------------------------");
        hierarchicalInheritance.hierarchicalInheritance(number1, number2); // Calling the hierarchicalInheritance() method
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("---------------------------------");
        System.out.println("   The Project 4 is completed!   ");
        System.out.println("---------------------------------");
        System.out.println("*********************************");
        System.out.println();
        System.out.println();
        /*
         * End of Project 4
         */

        scanner.close(); // Closing the Scanner object
    }
}