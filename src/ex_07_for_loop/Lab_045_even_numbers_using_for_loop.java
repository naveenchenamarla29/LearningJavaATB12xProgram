package ex_07_for_loop;

import java.util.Scanner;

public class Lab_045_even_numbers_using_for_loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to print the even numbers from 0 to the number given by you:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            for (int i = 0; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }


        } else {
            System.out.println("Please enter an integer type input");
        }
    }
}
