package ex_05_if_condition;

import java.util.Scanner;

public class Lab038_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age: ");
        age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are ineligible to vote");
        } else {
            System.out.println("You are eligible to vote!");
        }

    }
}
