package Ex_06_Switch_Case;

public class Lab042_Switch_Case_char {
    public static void main(String[] args) {
        char c = 'A';

        // 65 is accepted because in Java, the char 'A' has an ASCII/Unicode value of 65, so case 65 matches 'A'
        switch(c) {
            case 65:
                System.out.println("65 is the integer value for A");
                break;
            case 64:
                System.out.println("64 is not the integer value for A");
                break;
        }
    }
}
