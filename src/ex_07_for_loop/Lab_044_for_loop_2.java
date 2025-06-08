package ex_07_for_loop;

public class Lab_044_for_loop_2 {
    public static void main(String[] args) {

        //for loop without initialization code in loop

        //Here we declared i outside the for loop block and hence it can be used outside of the loop also
        int i = 0;
        for (; i < 10 ; i++) { //i here isn't used inside loop, its fine
            System.out.println(i);
        }


        //Here, there is no condition
        //It accepts but the code goes on infinite times
        for (int j = 0;; j++) { //No condition block, it is accepted
            System.out.println(j);

        }
    }
}
