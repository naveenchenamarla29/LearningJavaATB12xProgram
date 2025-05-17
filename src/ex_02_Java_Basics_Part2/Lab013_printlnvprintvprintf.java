package ex_02_Java_Basics_Part2;

public class Lab013_printlnvprintvprintf {
    public static void main(String[] args) {
        int a = 100;

        System.out.println("Your value is " + a); //prints 10 with new line
        System.out.print("Your value is " + a); //prints 10 without new line

        /*
         * %d -> int, byte, long, short
         * %s -> String
         * %f -> float, double
         * %b -> boolean
         * */

        //prints 10 using %d which will be replaced by variable a & without new line
        System.out.printf("Your value is %d", a);

        //Now when we try to print %d value, it gives %d only but not the value of a
        System.out.println();
        System.out.println("%d");

        int b = 20;
        int c = 30;

        System.out.printf("The value of b is %d" + " and the value of c is %d", b, c);



    }
}
