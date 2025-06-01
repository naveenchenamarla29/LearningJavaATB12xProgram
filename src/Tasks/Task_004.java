package Tasks;

public class Task_004 {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 9;


        // Correct and simplified ternary structure to find the greatest of a, b, c
        String greater_number =
                (a > b)
                        ? (a > c ? a + " is the biggest number" : c + " is the biggest number")
                        : (b > c ? b + " is the biggest number" : c + " is the biggest number");

        System.out.println(greater_number);

        }


    }

