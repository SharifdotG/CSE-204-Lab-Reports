/*
 * @SharifdotG
 * @file: CGPACalculation.java
 * @description: CGPACalculation class for CGPA Calculator
 * @date: 2021-05-15
 */

public class CGPACalculation {
    public static double calculateCGPA(double[] gpas) {
        double sum = 0;
        for (double gpa : gpas) {
            sum += gpa;
        }
        return sum / gpas.length;
    }

    public static void validateGPA(double gpa) throws UserInputException {
        if (gpa < 0.0) {
            throw new UserInputException("GPA cannot be negative.");
        } else if (gpa > 4.0) {
            throw new UserInputException("GPA cannot be greater than 4.0.");
        }
    }
}
