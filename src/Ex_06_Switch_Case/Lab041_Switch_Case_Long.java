package Ex_06_Switch_Case;

public class Lab041_Switch_Case_Long {

        public static void main(String[] args) {

            //the switch statement in Java does not support long data types directly
            // However, you can safely cast the long to an int (if its value fits within the range of int), and then use that in the switch.

            // Declare a long variable
            long ln = 2544L;

            // Cast long to int
            int number = (int) ln;

            // Use switch with the casted int value
            switch (number) {
                case 1000:
                    System.out.println("Value is 1000");
                    break;
                case 2544:
                    System.out.println("Value is 2544");
                    break;
                case 3000:
                    System.out.println("Value is 3000");
                    break;
                default:
                    System.out.println("Value does not match any case.");
            }
        }
    }


