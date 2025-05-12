package ex_01_Java_Basics;

public class Lab006_PrintvsPrintln {
    public static void main(String[] args) {
        System.out.println("println prints the statement and terminates the line and creates a new line");
        System.out.print("print prints the statement and doesn't terminate the line");
        System.out.print(" print prints the statement and doesn't terminate the line");
        System.out.println(" print prints the statement and doesn't terminate the line");
        //the above statement also prints in the same line beside the previous print statement
        System.out.print("This will print in the new line even though it is print");
    }
}
