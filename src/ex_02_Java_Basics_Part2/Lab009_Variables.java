package ex_02_Java_Basics_Part2;

public class Lab009_Variables {

    public static void main(String[] args) {

        //can't use enum as a variable_name/identifier as this is a keyword in Java
        //int enum = 98; // error java: as of release 5, 'enum' is a keyword, and may not be used as an identifier

        int Enum = 98;
        //This is valid as this is not a keyword in Java
        System.out.println(Enum);

        //int age value= 65; //Spaces not allowed

        //class name is allowed as a variable
        int Lab009_Variables = 23;


    }

}
