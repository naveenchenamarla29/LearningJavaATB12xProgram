package ex_07_for_loop;

import java.util.Scanner;

public class Lab_049_While_loop_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number_1 = -1;

        while (number_1 != 0) {
            System.out.println("Enter the number");
            number_1 = sc.nextInt();
            System.out.println("Good! Keep going on!");
        }

        System.out.println("You're out!");

    }
}
