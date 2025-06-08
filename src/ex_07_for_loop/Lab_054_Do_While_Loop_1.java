package ex_07_for_loop;

public class Lab_054_Do_While_Loop_1 {
    public static void main(String[] args) {

        int a = 10;

        //Here, it first prints the a value without checking the condition
        //And after the first time print, it checks for the condition in while code
        do {
            System.out.println(a);
            a++;
        } while(a < 20);
    }
}
