package ex_04_Operators;

public class Lab032_Interview {
    public static void main(String[] args) {
        char a = 'A'; //A = 65
        char b = 'B'; //B = 66

        //Here, it does not print AB but prints 131 as char has integer values associated with their respective characters
        System.out.println(a + b);

        System.out.println(a == 65); //true as number equivalent to char A is 65
        System.out.println('B' == 66); //true as number equivalent to char B is 65

        short s = 25;
        System.out.println(s + a); //gives 90 (25 + 65)
    }
}
