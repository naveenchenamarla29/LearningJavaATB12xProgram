package Tasks;

import java.util.Scanner;

public class Task_006 {
    public static void main(String[] args) {

        //This is a program to find out if a triangle is an equilateral or isosceles or a scalene triangle
        //Using if, if-else and else conditions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle");
        System.out.println("Please enter the first side: ");
        int side1 = sc.nextInt();
        System.out.println("Please enter the second side: ");
        int side2 = sc.nextInt();
        System.out.println("Please enter the third side: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 ==  side3) {
            System.out.println("The triangle is an Equilateral triangle");
        } else if (side1 == side2 || side2==side3 || side3==side1) {
            System.out.println("The triangle is an Isosceles triangle");
        } else {
            System.out.println("The triangle is a Scalene triangle");
        }

    }
}
