package ex_07_for_loop;

public class Lab_047_for_loop_4 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                //When 'i' reaches 5, it continues (Meaning, it will skip the print statement below and goes to increment statement
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

        //printing odd numbers using continue
        for (int j = 0; j < 50; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println("Odd -> " + j);
        }
    }
}
