package Phase1.Assingment_02;

import java.util.Scanner;

public class Ass_02_Q6 {
    public static void main(String[] args) {
//        6. Input currency in rupees and output in USD.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money in Indian rupee :");
        float rs = sc.nextFloat();
        double usd = (rs * (0.012));
        System.out.println("Money in USD : "+usd);
    }
}
