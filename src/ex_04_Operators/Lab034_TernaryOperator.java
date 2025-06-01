package ex_04_Operators;

public class Lab034_TernaryOperator {
    public static void main(String[] args) {

        /*
         * This program demonstrates the use of the Ternary Operator in Java.
         *
         * Ternary Operator Syntax:
         *   condition ? expression_if_true : expression_if_false;
         *
         * It is a shorthand for an if-else statement.
         * Useful for assigning a value based on a condition in a single line.
         */

        int age = 17; // Declare and initialize an integer variable 'age' with the value 17

        /*
         * Using the ternary operator to determine voting eligibility.
         *
         * Condition: (age > 18)
         * If true → assign "Yes, you are eligible for voting" to 'eligibility'
         * If false → assign "No you are not eligible for voting" to 'eligibility'
         */
        String eligibility = age > 18 ? "Yes, you are eligible for voting" : "No you are not eligible for voting";
        // Ternary operation result is stored in 'eligibility'

        System.out.println(eligibility); // Prints the result based on the age (output: No you are not eligible for voting)

        //Printing greater number out of two numbers
        int x = 20;
        int y = 30;

        String greater_number = x > y ? "x is bigger number" : "y is bigger number";
        System.out.println(greater_number);

        //another way
        int max = x > y ? x : y ;
        System.out.println(max);

    }
}
