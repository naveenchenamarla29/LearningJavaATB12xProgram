package ex_07_for_loop;

import java.util.Scanner;

public class Lab_051_While_Loop_3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number = 75;
        int user_number = -1;
        int guess_counter = 0;
        System.out.println("Enter the number:");
        while (user_number != number) {
            user_number = sc.nextInt();
            if (user_number < number) {
                System.out.println("Wrong guess! The number entered by you is lesser than the guessing number");
                guess_counter = guess_counter + 1;
                System.out.println("Enter the number again");
            } else if (user_number > number) {
                System.out.println("Wrong guess! The number entered by you is greater than the guessing number");
                guess_counter = guess_counter + 1;
                System.out.println("Enter the number again!");
            }
        }

        System.out.println("Great! you guessed it right! Its: " + number);
        System.out.println("Your total guesses are: "+ (guess_counter + 1));
    }
}
