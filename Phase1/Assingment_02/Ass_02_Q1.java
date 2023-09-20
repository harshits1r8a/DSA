package Phase1.Assingment_02;

import java.util.Scanner;

public class Ass_02_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1.Write a program to print whether a number is even or odd, also take input from the user.
        System.out.println("Enter no.for check is even or odd");
        int num = sc.nextInt();
        String ans = num%2 == 0 ? num+" is even" : num+" is odd";
        System.out.println(ans);

    }
}
