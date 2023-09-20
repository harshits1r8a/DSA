package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q1 {
    public static void main(String[] args) {
//        Q1.Area Of Circle Java Program
        System.out.print("Enter radius of circle:");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextFloat();
        final double pi = 3.14;
        double area = pi*Math.pow(r,2);
        System.out.println("Area of circle : "+ area + " square unit");
    }
}
