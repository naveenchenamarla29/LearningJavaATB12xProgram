package ex_02_Java_Basics_Part2;

public class Lab014_Constants {
    public static void main(String[] args) {
        //int a;

        // you will get error as "java: variable a might not have been initialized"
        //Because, local variables must be assigned a value
        //System.out.println(a);

        //local variable
        int b = 10;
        System.out.println(b);

        final int c = 45;

        System.out.println(c);

        //cannot change value for a final variable
        final int d = 46;

        //You will get an error as "java: cannot assign a value to final variable c"
        //System.out.println(c);

        //even the final variable cannot be increased also
        //d=d+1; //error comes as "java: cannot assign a value to final variable d"

        System.out.println(d);

    }
}
