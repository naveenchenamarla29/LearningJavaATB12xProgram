package Tasks;

import java.util.Scanner;

public class Task_008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of the candidate");

        if(sc.hasNext()) {
            int marks = sc.nextInt();
            if(marks < 0 || marks > 100) {
                System.out.println("Please enter the marks between 0 to 100!");
            }
            else {
                switch (marks/10) {
                    case 10:
                    case 9:
                        System.out.println("The candidates's grade is 'A' and passed the examination!");
                        break;

                    case 8:
                        System.out.println("The candidate's grade is 'B' and passed the examination!");
                        break;

                    case 7:
                        System.out.println("The candidate's grade is 'C' and passed the examination!");
                        break;

                    case 6:
                        System.out.println("The candidate's grade is 'D' and passed the examination! ");
                        break;
                    case 5:
                    case 4:
                        System.out.println("The candidate's grade is 'E' and passed the examination!");
                        break;

                    default:
                        System.out.println("The candidate's grade is 'F' and failed the examination! Better luck next time!");
                }
            }
        }

        else {
            System.out.println("Please enter valid numeric input");
        }



    }
}
