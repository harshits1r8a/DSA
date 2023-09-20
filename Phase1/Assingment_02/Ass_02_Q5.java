package Phase1.Assingment_02;

import java.util.Scanner;

public class Ass_02_Q5 {
    public static void main(String[] args) {
//        5. Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two num for find largest num.");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        String result = num1 > num2 ? num1+" is largest num." : num2+" is largest num.";
        System.out.println(result);
    }
}
