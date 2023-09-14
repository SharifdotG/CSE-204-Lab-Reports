/*
 * @SharifdotG
 * @file: CGPACalculation.java
 * @description: CGPACalculation class for CGPA Calculator
 * @date: 2021-05-15
 */

public class CGPACalculation {
    public static double calculateCGPA(double[] gpas) {
        double sum = 0;
        for (double gpa : gpas) { // Enhanced for loop to iterate through the array
            sum += gpa; // Adding each GPA to the sum
        }
        return sum / gpas.length; // Returning the average GPA
    }

    /*
     * This method is used to validate the GPA which throws a UserInputException if the GPA is invalid
     */
    public static void validateGPA(double gpa) throws UserInputException {
        if (gpa < 0.0) {
            throw new UserInputException("GPA cannot be negative."); // Throwing a UserInputException if the GPA is negative
        } else if (gpa > 4.0) {
            throw new UserInputException("GPA cannot be greater than 4.0."); // Throwing a UserInputException if the GPA is greater than 4.0
        }
    }
}
