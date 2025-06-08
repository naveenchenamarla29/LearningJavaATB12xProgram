package Tasks;

import java.util.Scanner;

public class Task_007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month number from 1 to 12 and also enter a year");

        System.out.println("Please enter a month number");
        if (sc.hasNextInt()) {
            int month_number = sc.nextInt();

            System.out.println("Please enter a year");
            if (sc.hasNextInt()) {
                int year_number = sc.nextInt();

                switch (month_number) {
                    case 1:
                        System.out.println("It's January and has 31 days!");
                        break;

                    case 2:
                        if ((year_number % 4 == 0 && year_number % 100 != 0) || (year_number % 400 == 0)) {
                            System.out.println("It's February and it's a leap year, so it has 29 days!");
                        } else {
                            System.out.println("It's February and it's not a leap year, so it has 28 days!");
                        }
                        break;

                    case 3:
                        System.out.println("It's March and it contains 31 days");
                        break;

                    case 4:
                        System.out.println("It's April and it contains 30 days");
                        break;

                    case 5:
                        System.out.println("It's May and it contains 31 days");
                        break;

                    case 6:
                        System.out.println("It's June and it contains 30 days");
                        break;

                    case 7:
                        System.out.println("It's July and it contains 31 days");
                        break;

                    case 8:
                        System.out.println("It's August and it contains 31 days");
                        break;

                    case 9:
                        System.out.println("It's September and it contains 30 days");
                        break;

                    case 10:
                        System.out.println("It's October and it contains 31 days");
                        break;

                    case 11:
                        System.out.println("It's November and it contains 30 days");
                        break;

                    case 12:
                        System.out.println("It's December and it contains 31 days"); // fixed 21 to 31
                        break;

                    default:
                        System.out.println("Invalid month number entered. Please enter a value from 1 to 12.");
                }

            } else {
                System.out.println("Invalid year entered. Please enter an integer value for year.");
            }

        } else {
            System.out.println("Invalid month number entered. Please enter an integer value for month.");
        }

        sc.close(); // always good to close the scanner


    }
}
