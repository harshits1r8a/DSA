package Phase1.Assingment_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ass_03_R14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer check weather no is armstrong or not :");
        int n = sc.nextInt();
        int n1 = n;
        int digit = String.valueOf(n).length();
        int arm = 0;
        while(n1 > 0){
            int rem = n1 % 10 ;
            arm += Math.pow(rem, digit);
            n1 /= 10;
        }
        if (n == arm){
            System.out.println(n+" is armstrong.");
        }else {
            System.out.println(n+" is not armstrong.");
        }
    }
}
