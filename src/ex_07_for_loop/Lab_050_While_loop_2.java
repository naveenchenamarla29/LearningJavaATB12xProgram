package ex_07_for_loop;

import java.util.Scanner;

public class Lab_050_While_loop_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Hello!");
            } else if (choice == 2) {
                System.out.println("Bye!");
            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Exited menu.");
    }
}
