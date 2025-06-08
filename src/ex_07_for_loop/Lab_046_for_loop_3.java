package ex_07_for_loop;

public class Lab_046_for_loop_3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {

            if (i == 5) {

                //once i is 5, it breaks the whole for loop and hence it won't reach the below print statement and 5 won't get printed
                break;
            }
            System.out.println(i);

        }

        System.out.println();

        //if we want 5 to get printed as well, then make print statement above if statament

        for (int j = 0; j <= 5; j++) {
            System.out.println(j);

            if (j == 5) {
                break;
            }
        }

    }
}
