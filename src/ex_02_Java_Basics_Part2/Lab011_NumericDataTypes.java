package ex_02_Java_Basics_Part2;

public class Lab011_NumericDataTypes {
    public static void main(String[] args) {
        // FYI, byte ranges from -128 to 127
        // byte age = 128;
        // Gives error as "java: incompatible types: possible lossy conversion from int to byte"
        // System.out.println(age);

        //short
        //short ranges from −32,768 to 32,767
        short s = 32767;
        System.out.println(s);

        //char
        //A single character is allowed
        char a = 'A';        // Latin uppercase
        char b = '9';        // Digit
        char c = '?';        // Punctuation
        char d = ' ';        // Space

        //long
        //long ranges from −9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //long datatype values should always end with 'l' or 'L'
        long l = 9223372036854775807l;
        long l1 = 92233720368547758l;
        System.out.println(l);
        System.out.println(l1);

        //float used to store decimal values
        //f or F need to be used at the end
        float f = 3.12f;
        float f1 = 3.12F;

        float piFloat = 3.1415926535f;    // Only keeps ~7 digits

        //double - keeps all digits and 'd' or 'D' is not needed at the end
        double piDouble = 3.1415926535;   // Keeps full precision

        System.out.println("float: " + piFloat);
        System.out.println("double: " + piDouble);


    }
}
