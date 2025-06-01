package Tasks;

public class Task_005 {
    public static void main(String[] args) {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b; //33 + 11 + 22 + 13 + 24 = 103

        System.out.println("a = " + a); //13
        System.out.println("b = " + b); //24
        System.out.println("c = " + c); //103

        System.out.println();

        int i = 1, j = 2, k = 3;
        int m = i-- - j-- - k--; // -4
        System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", m = " + m);


    }
}
