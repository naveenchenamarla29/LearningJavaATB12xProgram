package ex_07_for_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab_053_While_Loop_5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guessCounter = 0;

        System.out.println("Please enter the number to guess: ");


        while (true) {

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input entered! Please enter a valid number!");

                //this is needed to consume the invalid input. If we don't use this, then it will be infinite loop
                //When we give this it will consume the invalid input and when it sees continue; then
                //we can have fresh input
                sc.next();
                continue;
            }

            int guessNumber = sc.nextInt();

            if (guessNumber < 0 || guessNumber > 100) {
                System.out.println("Please enter the value from 1 to 100");
                continue;
            }


            if (guessNumber == number) {
                System.out.println("You guessed it right! Its " + number + "!");
                guessCounter++;
                break;
            } else if (guessNumber > number) {
                System.out.println("The number is greater than the actual number, Guess again!");
                guessCounter++;
            } else if (guessNumber < number) {
                System.out.println("The number is lesser than the actual number, Guess again!");
                guessCounter++;
            }
        }

        System.out.println("You guessed " + guessCounter + " times!");
    }
}
