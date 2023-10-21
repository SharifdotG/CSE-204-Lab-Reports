import LabReport8.Project1.GPAOperations;
import LabReport8.Project2.GetterSetterMethods;
import LabReport8.Project2.MagicNumberOperations;
import LabReport8.Project3.MethodOverriding;
import LabReport8.Project4.HierarchicalInheritance.HierarchicalInheritanceTest;
import LabReport8.Project4.MultilevelInheritance.MultilevelInheritanceTest;
import LabReport8.Project4.SingleInheritance.SingleInheritanceTest;
import LabReport8.Project5.ImplementingInterfaces;
import LabReport8.Project6.OverriddenMethods;
import LabReport8.Project7.MethodPrototypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************");
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
        System.out.println("*********************************");
        System.out.println();

        int choice;

        do {
            System.out.println("*********************************");
            System.out.println(" CSE 204 - Lab Report 8 (^///^)) ");
            System.out.println("     Project Selection! (‾◡◝)    ");
            System.out.println("             -------             ");
            System.out.println("              Menu:              ");
            System.out.println("       Choice 1: Project 1       ");
            System.out.println("       Choice 2: Project 2       ");
            System.out.println("       Choice 3: Project 3       ");
            System.out.println("       Choice 4: Project 4       ");
            System.out.println("       Choice 5: Project 5       ");
            System.out.println("       Choice 6: Project 6       ");
            System.out.println("       Choice 7: Project 7       ");
            System.out.println("   Choice 0: Exits The Program   ");
            System.out.println("             -------             ");
            System.out.print("Enter Project: ");
            choice = scanner.nextInt();
            System.out.println("             -------             ");
            System.out.println("*********************************");
            System.out.println();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("*********************************");
                    System.out.println("             -------             ");
                    System.out.println("      Project 1 - Exception      ");
                    System.out.println("The (Exception)al CGPA Calculator");
                    System.out.println("             -------             ");
                    System.out.println();

                    try {
                        System.out.println("             -------             ");
                        System.out.print("Enter your name: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();

                        int id;

                        while (true) {
                            try {
                                System.out.print("Enter your UID: ");
                                id = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("You ID needs to a number! ~(>_<。)＼");
                                System.out.println("Please try again! (；′⌒`))");
                            }
                        }

                        System.out.println("             -------             ");
                        System.out.println();

                        GPAOperations gpaOperations = new GPAOperations();
                        gpaOperations.gpaCollection();
                        double cgpa = gpaOperations.cgpaResult();

                        System.out.println("             -------             ");
                        System.out.println("Your Name: " + name);
                        System.out.println("Your UID: " + id);
                        System.out.printf("Your CGPA: %.2f\n", cgpa);
                        System.out.println("             -------             ");
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println("An Error Occurred! (。﹏。*): " + e.getMessage());
                        System.out.println("Please try again! ( •̀ ω •́ )✧");
                        System.out.println();
                    } finally {
                        System.out.println("             -------             ");
                        System.out.println("        Congratulations!!        ");
                        System.out.println("Project 1 is Completed! φ(゜▽゜*)♪");
                        System.out.println("             -------             ");
                        System.out.println("*********************************");
                        System.out.println();
                        System.out.println();
                    }

                    break;
                case 2:
                    System.out.println("*********************************");
                    System.out.println("             -------             ");
                    System.out.println("    Project 2 - Encapsulation    ");
                    System.out.println("  Encapsulation & Magic Numbers  ");
                    System.out.println("             -------             ");
                    System.out.println();

                    GetterSetterMethods getterSetterMethods = new GetterSetterMethods();
                    MagicNumberOperations magicNumberOperations = new MagicNumberOperations();

                    System.out.println("             -------             ");
                    System.out.print("Enter your name: ");
                    scanner.nextLine();
                    getterSetterMethods.setName(scanner.nextLine());
                    System.out.print("Enter your UID: ");
                    getterSetterMethods.setID(scanner.nextInt());
                    System.out.print("Enter the name of your University: ");
                    getterSetterMethods.setUniversity(scanner.next());
                    System.out.println();
                    System.out.println("Enter Two Numbers! ლ(╹◡╹ლ)");
                    System.out.print("Enter the First number (Between 1-20): ");
                    getterSetterMethods.setNumber1(scanner.nextInt());
                    System.out.print("Enter the Second number: ");
                    getterSetterMethods.setNumber2(scanner.nextDouble());
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.println("Your Name: " + getterSetterMethods.getName());
                    System.out.println("Your UID: " + getterSetterMethods.getID());
                    System.out.println("The name of your University: " +
                            getterSetterMethods.getUniversity());
                    System.out.println();

                    System.out.println("             -------             ");
                    magicNumberOperations.isEvenOrOdd(getterSetterMethods.getNumber1());
                    magicNumberOperations.factorial(getterSetterMethods.getNumber1());
                    magicNumberOperations.magicNumber2(getterSetterMethods.getNumber2());
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.println("         Congratulations         ");
                    System.out.println("Project 2 is Completed! (ﾉ*･ω･)ﾉ)");
                    System.out.println("             -------             ");
                    System.out.println("*********************************");
                    System.out.println();
                    System.out.println();

                    break;
                case 3:
                    System.out.println("*********************************");
                    System.out.println("             -------             ");
                    System.out.println("     Project 3 - Abstraction     ");
                    System.out.println("    Abstract Class & Methods     ");
                    System.out.println("             -------             ");
                    System.out.println();

                    MethodOverriding methodOverriding = new MethodOverriding();

                    System.out.println("             -------             ");
                    System.out.print("Enter a Number (Between 1-20): ");
                    scanner.nextLine();
                    methodOverriding.setNumber1(scanner.nextInt());
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    methodOverriding.isPrime();
                    methodOverriding.factorial();
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.println("         Congratulations         ");
                    System.out.println("Project 3 is Completed! ლ(╹◡╹ლ) ");
                    System.out.println("             -------             ");
                    System.out.println("*********************************");
                    System.out.println();
                    System.out.println();

                    break;
                case 4:
                    System.out.println("*********************************");
                    System.out.println("             -------             ");
                    System.out.println("     Project 4 - Inheritance     ");
                    System.out.println("  Types of Inheritances (✿◡‿◡)  ");
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.print("Enter First Number: ");
                    scanner.nextLine();
                    int number1 = scanner.nextInt();
                    System.out.print("Enter Second Number: ");
                    scanner.nextLine();
                    int number2 = scanner.nextInt();
                    System.out.println("             -------             ");
                    System.out.println();

                    SingleInheritanceTest singleInheritanceTest
                            = new SingleInheritanceTest(number1, number2);
                    MultilevelInheritanceTest multilevelInheritanceTest
                            = new MultilevelInheritanceTest(number1, number2);
                    HierarchicalInheritanceTest hierarchicalInheritanceTest
                            = new HierarchicalInheritanceTest(number1, number2);

                    System.out.println("             -------             ");
                    singleInheritanceTest.singleInheritance();
                    multilevelInheritanceTest.multilevelInheritance();
                    hierarchicalInheritanceTest.hierarchicalInheritance();
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.println("         Congratulations         ");
                    System.out.println(" Project 4 is Completed! (⓿_⓿)) ");
                    System.out.println("             -------             ");
                    System.out.println("*********************************");
                    System.out.println();
                    System.out.println();

                    break;
                case 5:
                    System.out.println("*********************************");
                    System.out.println("             -------             ");
                    System.out.println("      Project 5 - Interface      ");
                    System.out.println("Implementing Multiple Interfaces!");
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.print("Enter First Number: ");
                    scanner.nextLine();
                    int number3 = scanner.nextInt();
                    System.out.print("Enter Second Number: ");
                    scanner.nextLine();
                    int number4 = scanner.nextInt();
                    System.out.println("             -------             ");
                    System.out.println();

                    ImplementingInterfaces implementingInterfaces = new ImplementingInterfaces();

                    System.out.println("             -------             ");
                    implementingInterfaces.sum(number3, number4);
                    implementingInterfaces.sub(number3, number4);
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.println("         Congratulations         ");
                    System.out.println("Project 5 is Completed! (●ˇ∀ˇ●))");
                    System.out.println("             -------             ");
                    System.out.println("*********************************");
                    System.out.println();
                    System.out.println();

                    break;
                case 6:
                    System.out.println("*********************************");
                    System.out.println("             -------             ");
                    System.out.println("   Project 6 - Method Override   ");
                    System.out.println("   Method Overriding Showcase!   ");
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.print("Enter a Number: ");
                    scanner.nextLine();
                    int number5 = scanner.nextInt();
                    System.out.println("             -------             ");
                    System.out.println();

                    OverriddenMethods overriddenMethods = new OverriddenMethods();

                    System.out.println("             -------             ");
                    overriddenMethods.reverseNumber(number5);
                    overriddenMethods.fibonacci(number5);
                    overriddenMethods.digitSum(number5);
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.println("         Congratulations         ");
                    System.out.println("Project 6 is Completed!( $ _ $ ))");
                    System.out.println("             -------             ");
                    System.out.println("*********************************");
                    System.out.println();
                    System.out.println();

                    break;
                case 7:
                    System.out.println("*********************************");
                    System.out.println("             -------             ");
                    System.out.println("   Project 7 - Method Overload   ");
                    System.out.println("   Method Overloading Showcase   ");
                    System.out.println("             -------             ");
                    System.out.println();

                    MethodPrototypes methodPrototypes = new MethodPrototypes();

                    System.out.println("             -------             ");
                    System.out.println("3 Operations Below will be performed");
                    System.out.println("using the same method name under");
                    System.out.println("the usage of Method Overloading!");
                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.println("Positive, Negative or Zero?!");
                    System.out.println("Return Type: Void");
                    System.out.println("Parameter: 1 Integer");
                    System.out.println();
                    System.out.print("Enter an Integer: ");
                    scanner.nextLine();
                    int number6 = scanner.nextInt();
                    System.out.println();
                    methodPrototypes.thisOrThat(number6);

                    System.out.println("             -------             ");

                    System.out.println("Maximum Between of 3 Double Numbers!");
                    System.out.println("Return Type: Double");
                    System.out.println("Parameter: 3 Doubles");
                    System.out.println();
                    System.out.print("Enter 3 Double Numbers (Put Spaces Between them): ");
                    double number7 = scanner.nextDouble();
                    double number8 = scanner.nextDouble();
                    double number9 = scanner.nextDouble();
                    double max = methodPrototypes.thisOrThat(number7, number8, number9);
                    System.out.println();
                    System.out.println("The Maximum Number is: " + max + "! (_　_)。゜zｚＺ");

                    System.out.println("             -------             ");

                    System.out.println("Entering the Correct Week Name!");
                    System.out.println("Return Type: String");
                    System.out.println("Parameter: 1 String");
                    System.out.println();
                    System.out.print("Enter a Week Name: ");
                    String weekName = scanner.next();
                    String validateWeekName = methodPrototypes.thisOrThat(weekName);
                    System.out.println(validateWeekName);

                    System.out.println("             -------             ");
                    System.out.println();

                    System.out.println("             -------             ");
                    System.out.println("         Congratulations         ");
                    System.out.println("Project 7 is Completed! ( *︾▽︾))");
                    System.out.println("             -------             ");
                    System.out.println("*********************************");
                    System.out.println();
                    System.out.println();

                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}