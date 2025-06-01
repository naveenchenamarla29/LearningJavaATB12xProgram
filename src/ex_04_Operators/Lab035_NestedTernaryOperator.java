package ex_04_Operators;

public class Lab035_NestedTernaryOperator {
    public static void main(String[] args) {
        int age = 20;

        //Nested ternary operator
        String goa_trip_eligibility = age > 18 ? (age > 21 ? "You are eligible for Drinking and for Goa trip" : "You are not eligible for Goa trip") : "You are not eligible for Goa trip";
        System.out.println(goa_trip_eligibility);

        //Program to find the greatest of thre numbers
        int n1 = 3;
        int n2 = 1;
        int n3 = 9;

        int result = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

        System.out.println(result);

        //Program to find if a person is a minor or an adult or a senior citizen
        int age1 = 64;
        
        String age_group = age1 < 18 ? "minor" : (age1 < 65 ? "adult" : "senior citizen");
        System.out.println(age_group);


    }
}
