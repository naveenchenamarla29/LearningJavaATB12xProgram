    package Ex_06_Switch_Case;

    // Import the Scanner class to take user input from the console
    import java.util.Scanner;

    // Define the public class named Lab039Switch_Case
    public class Lab040_Switch_Case_New {

        // Main method: entry point of the Java program
        public static void main(String[] args) {

            // Create a Scanner object to read input from the user
            Scanner sc = new Scanner(System.in);

            // Prompt the user to enter a number from 1 to 7
            System.out.println("Please enter the day number from 1 to 7:");

            // Check if the user has entered a valid integer
            if (sc.hasNextInt()) {

                // Read the integer entered by the user and store it in dayNumber variable
                int dayNumber = sc.nextInt();

                // Enhanced switch statement (Java 14+) to determine the day
                switch (dayNumber) {
                    case 1 -> System.out.println("Today is Monday");
                    case 2 -> System.out.println("Today is Tuesday");
                    case 3 -> System.out.println("Today is Wednesday");
                    case 4 -> System.out.println("Today is Thursday");
                    case 5 -> System.out.println("Today is Friday");
                    case 6 -> System.out.println("Today is Saturday");
                    case 7 -> System.out.println("Today is Sunday");
                    default -> System.out.println("Invalid number entered! Please enter numbers from 1 to 7");
                }

            } else {
                // If input is not an integer, inform the user
                System.out.println("Invalid data entered. Please enter integer values only.");
            }

            // Close the scanner (good practice)
            sc.close();
        }
    }
