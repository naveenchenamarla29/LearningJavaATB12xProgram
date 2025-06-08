package Ex_06_Switch_Case;

// Import the Scanner class to take user input from the console

import java.util.Scanner;

// Define the public class named Lab039Switch_Case
public class Lab039Switch_Case {

    // Main method: entry point of the Java program
    public static void main(String[] args) {

                    /*
        ===========================================
        ✅ Data Types Allowed in switch (Java 7+)
        ===========================================

        byte   ✅   -> Allowed
        short  ✅   -> Allowed
        int    ✅   -> Most commonly used
        char   ✅   -> Useful for switching on single characters
        String ✅   -> Supported from Java 7 onwards
        enum   ✅   -> Great for fixed set of constants

        ===========================================
        ❌ Data Types NOT Allowed in switch
        ===========================================

        long    ❌  -> Too large for switch, use if-else instead
        float   ❌  -> Not allowed due to decimal precision issues
        double  ❌  -> Same reason as float (imprecise)
        boolean ❌  -> Only true/false, use if-else instead
        Object  ❌  -> Cannot switch on general object references
        Array   ❌  -> Arrays are not valid switch expressions
        */

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number from 1 to 7
        System.out.println("Please enter the day number from 1 to 7");



        if (sc.hasNextInt()) { //This checks for if we have entered an integer value only then it will go inside if block

            // Read the integer entered by the user and store it in dayNumber variable
            int dayNumber = sc.nextInt();


            // Start of switch statement to determine the day based on the number
            switch (dayNumber) {

                // If dayNumber is 1, print "Today is Monday"
                case 1:
                    System.out.println("Today is Monday");
                    break;

                // If dayNumber is 2, print "Today is Tuesday"
                case 2:
                    System.out.println("Today is Tuesday");
                    break;

                // If dayNumber is 3, print "Today is Wednesday"
                case 3:
                    System.out.println("Today is Wednesday");
                    break;

                // If dayNumber is 4, print "Today is Thursday"
                case 4:
                    System.out.println("Today is Thursday");
                    break;

                // If dayNumber is 5, print "Today is Friday"
                case 5:
                    System.out.println("Today is Friday");
                    break;

                // If dayNumber is 6, print "Today is Saturday"
                case 6:
                    System.out.println("Today is Saturday");
                    break;

                // If dayNumber is 7, print "Today is Sunday"
                case 7:
                    System.out.println("Today is Sunday");
                    break;

                // If the input doesn't match any case from 1 to 7, execute this block
                default:
                    System.out.println("Invalid number entered! Please enter numbers from 1 to 7");
            }

        } else {
            System.out.println("Invalid data entered. Please enter integer values");
        }


    }
}
