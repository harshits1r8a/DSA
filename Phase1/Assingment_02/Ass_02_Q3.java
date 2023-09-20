package Phase1.Assingment_02;

import java.util.Scanner;

public class Ass_02_Q3 {
    public static void main(String[] args) {
//        3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        SI = (P*R*T)/100
        Scanner sc = new Scanner(System.in);
        float P = sc.nextFloat();
        float R = sc.nextFloat();
        float T = sc.nextFloat();
        float SI = (P*R*T)/100;

        System.out.println("SI :"+ SI);
    }
}
