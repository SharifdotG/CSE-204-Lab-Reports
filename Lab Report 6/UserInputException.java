/*
 * @SharifdotG
 * @file: UserInputException.java
 * @description: UserInputException class for CGPA Calculator
 * @date: 15-9-2023
 */

/*
 * This class is used to throw an exception if the user input is invalid
 */
public class UserInputException extends Exception {
    public UserInputException(String message) { // Constructor for UserInputException class
        super(message); // Calling the constructor of the parent class
    }
}