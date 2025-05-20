package ex_04_Operators;

public class Lab026_Concatenation {
    public static void main(String[] args) {
        String first_name = "Naveen";
        String second_name = "Chenamarla";
        int a = 10;
        int b = 12;

        // Statement 1
        System.out.println(first_name + second_name + a + b); // Output: NaveenChenamarla1012
        /*
         Explanation:
         - Java evaluates from left to right.
         - first_name + second_name → "NaveenChenamarla" (String)
         - Then "NaveenChenamarla" + a → "NaveenChenamarla10" (String)
         - Then "NaveenChenamarla10" + b → "NaveenChenamarla1012" (String)
         - Once a String is involved, all subsequent '+' operations are string concatenation.
        */

        // Statement 2
        System.out.println(a + b + first_name + second_name); // Output: 22NaveenChenamarla
        /*
         Explanation:
         - a + b → 10 + 12 = 22 (int)
         - 22 + first_name → "22Naveen" (String)
         - "22Naveen" + second_name → "22NaveenChenamarla" (String)
         - Since no String is involved until after the arithmetic, Java performs addition first.
        */

        // Statement 3
        System.out.println(first_name + second_name + (a + b)); // Output: NaveenChenamarla22
        /*
         Explanation:
         - (a + b) is inside parentheses, so evaluated first → 10 + 12 = 22
         - first_name + second_name → "NaveenChenamarla" (String)
         - "NaveenChenamarla" + 22 → "NaveenChenamarla22" (String)
         - Parentheses force addition before concatenation.
        */

    }
}
