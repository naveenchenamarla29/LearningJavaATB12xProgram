package ex_07_for_loop;

import java.util.Scanner;

public class Lab_055_Do_While_Loop_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "Y";

            do {
                System.out.println("Please enter the candidate's marks");

                if(!sc.hasNextInt()) {
                    System.out.println("Please enter a valid input");
                    sc.next();
                    continue;
                }
                int marks = sc.nextInt();

                if (marks >= 80 && marks <= 100) {
                    System.out.println("You got A grade!");
                }
                else if (marks >= 60 && marks < 80) {
                    System.out.println("You  got B grade!");
                } else if (marks >= 45 && marks < 60) {
                    System.out.println("You got C grade!");
                } else if (marks >= 35 && marks < 45) {
                    System.out.println("You got D grade!");
                }
                else {
                    System.out.println("You got failed!");
                }



                 while(true) {
                     System.out.println("Do you want to check for another candidate's marks? (Y/N)");
                     choice= sc.next();

                     if(choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("N")) {
                         break;
                     }
                     else {
                         System.out.println("Invalid choice. Please enter only 'Y' or 'N'.");
                     }
                 }


            } while(choice.equalsIgnoreCase("Y"));

            System.out.println("Thanks for using the marks calculator!");

    }
}
