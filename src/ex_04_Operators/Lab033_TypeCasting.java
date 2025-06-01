package ex_04_Operators;

public class Lab033_TypeCasting {
    public static void main(String[] args) {
        /*
         * This program demonstrates Java's type casting concepts:
         * - Implicit (Widening) Type Casting
         * - Explicit (Narrowing) Type Casting
         *
         * Type Casting:
         * Type casting is the process of converting a variable from one data type to another.
         *
         * 1. Implicit Type Casting (Widening):
         *    - Happens automatically when converting a smaller data type to a larger one.
         *    - No data loss occurs.
         *    - Example: byte → short → int → long → float → double
         */
        byte b1 = 42;
        int a1 = b1; // Implicit type casting from byte to int (widening conversion)

        /*
         * 2. Explicit Type Casting (Narrowing):
         *    - Must be manually specified by the programmer using parentheses.
         *    - Data may be lost if the value is outside the range of the target type.
         *    - Example: double → float → long → int → short → byte
         */
        int a = 300;
        byte b = (byte) a; // Explicit type casting from int to byte (narrowing conversion)

        System.out.println(b); // Output: 44

        /*
         * Why is the output 44?
         * - The value 300 is outside the byte range (-128 to 127).
         * - When you cast 300 to a byte, it overflows and wraps around using modulo 256.
         * - 300 % 256 = 44 → So the value stored in byte b becomes 44.
         *
         * Internally, the lower 8 bits of the integer 300 are retained (300 in binary: 00000001 00101100),
         * and only the last 8 bits (00101100) are kept, which equals 44 in decimal.
         */

    }
}
