package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q1. Factorial
        try{
            System.out.print("Enter integer for find its factorial :");
            int f = sc.nextInt();
            int fact = 1;
            for (int i = f ; i > 0 ; i--){
                fact *= i;
            }
            System.out.println("Factorial of "+ f +" : "+ fact);
        }catch(Exception e){
            System.out.println("Something went  wrong");
        }
    }
}
