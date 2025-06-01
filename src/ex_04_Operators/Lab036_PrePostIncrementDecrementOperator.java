package ex_04_Operators;

public class Lab036_PrePostIncrementDecrementOperator {
    public static void main(String[] args) {


        //post-incrementation
        int x = 5;
        int a = x++; //Here, it first assigns original x value i.e., 5 amd hence it stores 5 in a
        System.out.println(a); //That is why you will always get 5 when you print a

        /*
        But x will be incremented later after that expression (int a = x++)
        THat is why when we print x now it returns 6
        */
        System.out.println(x);

        System.out.println();


        //Now let us assign an integer to a different variable
        int y = 5;
        /*
        Now instead of assigning post incremented value to a variable,
        Lets print the post incremented value now
        */
        System.out.println(y++); //Even this first prints the original value first
        System.out.println(y); //Now when we print y again it prints the incremented value i.e., 6

        System.out.println();

        //pre-incrementation
        int z = 5;
        int b = ++z; //Here, it first increments the original value to 6 and assigns it to b and then incremented value will be used later
        System.out.println(b); //That is why you will get incremented value

        System.out.println();

        //Now let us assign an integer to a different variable
        int m = 5;
        /*
        Now instead of assigning pre-incremented value to a variable,
        Lets print the pre-incremented value now
        */
        System.out.println(++m); //Now it pre-increments first and prints the incremented value i.e., 6
        System.out.println(m); //Now when we print m again it prints the incremented value i.e., 6

        System.out.println();

        int h = 5;

        //Here, it first prints h (5) and later h incremented to 6 and when adding to itself, it is adding 6
        System.out.println(h++ + h); //5 + 6 = 11

        System.out.println();

        int j = 10;
        System.out.println(j++ + ++j); //10 +12 = 22
        System.out.println(j); //12

        System.out.println();

        int f = 10;
        System.out.println(++f + ++f); //11 +12 = 23
        System.out.println(f); //12


    }
}
