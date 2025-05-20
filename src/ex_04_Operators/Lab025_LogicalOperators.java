package ex_04_Operators;

public class Lab025_LogicalOperators {
    public static void main(String[] args) {
        /*
         * && -> And
         * || -> OR
         * ! -> NOT
         */

        boolean a = true;

        //! -> as it is NOT operator, it returns the opposite
        System.out.println(!a); //Here, it returns false

        boolean b = true;
        System.out.println(!!b); //This double negates which will cancel each other and returns true (original value)

        /*
         Logical Operators in Java: && (AND), || (OR)

         Truth Table for &&
         ------------------------
         | A     | B     | A && B |
         ------------------------
         | true  | true  | true   |
         | true  | false | false  |
         | false | true  | false  |
         | false | false | false  |
         ------------------------

         Truth Table for ||
         ------------------------
         | A     | B     | A || B |
         ------------------------
         | true  | true  | true   |
         | true  | false | true   |
         | false | true  | true   |
         | false | false | false  |
         ------------------------

         Notes:
         - && returns true only if both operands are true.
         - || returns true if at least one operand is true.
         - Both are short-circuit operators:
             - For &&: If A is false, B is not evaluated.
             - For ||: If A is true, B is not evaluated.
        */

        System.out.println();


        boolean a1 = true && true;
        boolean a2 = true && false;
        boolean b1 = false && true;
        boolean b2 = false && false;

        System.out.println(a1); //true
        System.out.println(a2); //false
        System.out.println(b1); //false
        System.out.println(b2); //false

        System.out.println();


        boolean a3 = true || true;
        boolean a4 = true || false;
        boolean b3 = false || true;
        boolean b4 = false || false;

        System.out.println(a3); //true
        System.out.println(a4); //true
        System.out.println(b3); //true
        System.out.println(b4); //false

    }
}
