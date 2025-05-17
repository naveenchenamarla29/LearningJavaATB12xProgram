package ex_03_Literals;

public class Lab018_CharLiteral {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        //Not a char but a String
        //Gives error as change the datatype to String
        //char d = "A";

        char new_line = '\n';
        char tab_line = '\t';

        System.out.println("Hi" + tab_line + "Naveen"); // \t gives a space
        System.out.println("Naveen" + new_line + "Chenamarla"); // \n gives a new line

        //ASCII value - A = 65 (but backed by a numeric value internally (based on the character encoding, typically Unicode))
        char c1= 'A';
        System.out.println(c1+1); //when added with a number it gives a number (65+1  = 66)


        //Here, '5' is stored as a character, but casting it to an int gives you its Unicode value (53).
        char c2 = '5';
        System.out.println(c2);            // Output: 5
        System.out.println((int) c2);      // Output: 53


    }

}
