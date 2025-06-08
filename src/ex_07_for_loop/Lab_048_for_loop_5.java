package ex_07_for_loop;

import java.util.Scanner;

public class Lab_048_for_loop_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to find out the factorial of it: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int factorial = 1;

            if (number == 0) {
                System.out.println(factorial);
            }

            for (int i = number; i > 0; i--) {
                factorial = factorial * i;
            }

            System.out.println("The factorial of the number " + number + " is " + factorial);
        } else {
            System.out.println("Please enter an integer input!");
        }


    }
}
