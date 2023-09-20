package Phase1.Assingment_02;

import java.util.Scanner;

public class Ass_02_Q2 {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that particular name.
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String greeting = "Hii "+name+". How are you !";
        System.out.println(greeting);
    }
}
