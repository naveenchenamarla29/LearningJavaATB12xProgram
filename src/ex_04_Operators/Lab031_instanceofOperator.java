package ex_04_Operators;

public class Lab031_instanceofOperator {
    public static void main(String[] args) {
        String s1 = new String("Naveen");

        //Prints the boolean output of whether it is a String or not
        System.out.println(s1 instanceof String);

        //This gives error if other data type was checked by instanceof

        //int a = 10;
        //System.out.println(a instanceof String);
    }
}
