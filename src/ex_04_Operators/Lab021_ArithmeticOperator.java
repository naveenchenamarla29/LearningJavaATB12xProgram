package ex_04_Operators;

public class Lab021_ArithmeticOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        float c = 3.1f;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b); //Gives quotient as the output
        System.out.println(a % b); //Gives remainder as output
        System.out.println(a / c); //gives a float value whenever we divide with float
        System.out.println(c / a); //gives a float value whenever we divide with float
        System.out.println("a+b"); //a+b is the output as it prints the value inside the quotes as it is treated as a String
    }
}
