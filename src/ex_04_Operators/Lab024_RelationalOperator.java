package ex_04_Operators;

public class Lab024_RelationalOperator {
    public static void main(String[] args) {

//        > - Greater than
//        < - Less than
//        >= greater than or equal to
//        <= Less than or equal to
//        != not equal to
//        == - checks if it is equal to

//        All of these will return boolean output

        int a = 10;
        int b = 30;

        boolean c = a > b;

        System.out.println(c); //returns boolean output of false
        System.out.println(a > b); //Or you can use direct print as well

        int age_naveen = 29;
        int age_rahul = 29;

        boolean age_result = age_naveen >= age_rahul;

        //As we used >= we can see both the ages of the above variables are same
        //Hence, we got the result as true
        System.out.println(age_result); //true
    }
}
