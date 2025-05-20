package ex_04_Operators;

public class Lab022_UnaryOperator {
    public static void main(String[] args) {

        //Unary Operator
        int a = +10; //We can either assign the + before 10 or ignore, does not matter
        System.out.println(a);

        int b = -10;
        System.out.println(b);

        int result = a + b;
        System.out.println("a + b is " + result); //10 + (-10) = 0

    }
}
