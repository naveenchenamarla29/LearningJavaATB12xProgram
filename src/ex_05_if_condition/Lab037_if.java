package ex_05_if_condition;

import java.util.Scanner;

public class Lab037_if {
    public static void main(String[] args) {

        //Program to find if a person is eligible for voting using if condition
        //We will use Scanner Class for taking user inputs

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are not eligible for voting as you are a minor");
        }

        System.out.println("You are eligible for voting!");

    }

}
