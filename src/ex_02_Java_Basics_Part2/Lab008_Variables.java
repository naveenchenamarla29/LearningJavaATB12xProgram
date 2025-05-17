package ex_02_Java_Basics_Part2;

public class Lab008_Variables {
    public static void main(String[] args) {


        int a = 10;
        byte b = 10;
        short s = 10;
        long l = 9876543210L;
        float f = 3.14F;
        double d = 67.8987654567;
        boolean b_1 = true;
        char c = 'A';

        //data_type variable_name/identifier = variable_value
        // '=' assignment operator
        byte age = 65; //byte = -128 to 127, hence best to use byte for age kind of scenarios
        age = 67; //variable values can be changed

        //int a = 9;
        //System.out.println(a); //9 - changing the same variable_name/identifier to a different data type is also possible

        int b1 = 45;
        b1 = 77 + 1;
        System.out.println(b); //Hence, b will be overwritten to 78 from 45

        int c1 = 87;
        c1 = c1 + 1; //88 (87 + 1)
        c = 89; //89 (overwritten)
        System.out.println(c); //89 (overwritten)

        //int _ = 9; allowed
        //System.out.println(_); //error: java: underscore not allowed here //can't be used

        int _2 = 87;
        System.out.println(_2); //allowed and can be used as well

        int $ = 98;
        System.out.println($); //$ is allowed and can be used as well

    }


}
