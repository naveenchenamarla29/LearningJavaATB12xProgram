package ex_07_for_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab_052_While_Loop_4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int guessNumber = rnd.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        while(true) {
            if(!sc.hasNextInt()) {
                System.out.println("Invalid input entered! Please enter a number");
                sc.next();
                continue;
            }
            else {
                break;
            }
        }

        int userNumber = sc.nextInt();
        int guessCounter = 0;

        if(userNumber==guessNumber) {
            System.out.println("You guessed it right! The number is: "+ guessNumber);
            guessCounter= guessCounter + 1;
        }
        while(userNumber!=guessNumber) {
            if(userNumber>guessNumber) {
                System.out.println("The number you entered is greater than the actual number! Keep trying again!");
                guessCounter= guessCounter + 1;
                userNumber=sc.nextInt();
            }
            else if(userNumber<guessNumber) {
                System.out.println("The number you entered is lesser than the actual number! Keep trying again!");
                guessCounter= guessCounter + 1;
                userNumber=sc.nextInt();
            }
        }

        System.out.println("You guessed it right! The number is: "+ guessNumber);
        guessCounter= guessCounter + 1;
        System.out.println("You guessed "+guessCounter+ " times!");



    }
}
