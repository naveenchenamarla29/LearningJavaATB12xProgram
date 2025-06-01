package Tasks;

public class Task_003 {
    public static void main(String[] args) {

        //Finding a number is odd or even using Ternary operator
        int number = 10;
        String even_or_odd = number % 2 == 0 ? number + " is an even number" : number + " is an odd number";
        System.out.println(even_or_odd);
    }
}
