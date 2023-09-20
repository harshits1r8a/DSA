package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R15 {
    public static void main(String[] args) {
//        Find Ncr & Npr

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("\nEnter the value of r : ");
        int r = sc.nextInt();
        float nPr =(float) fact(n)/fact(n-r);
        float nCr = (float) fact(n) /(fact(r)*fact(n-r));
        System.out.println("Permutation : "+ nPr);
        System.out.println("Combination : "+ nCr);
    }

    static  int fact(int n){
        int f = 1;
        for (int i = n; i >0 ;i-- ){
            f *= i;
        }
        return f;
    }
}
