package Phase1;

import java.util.Scanner;

public class V9_Q3Fibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth no. for no. of Fibbonacci Serise :");
        int n = sc.nextInt();
        System.out.println("nth Fibbonacci no. :" + nthFibbonacci(n) );
    }

    static int nthFibbonacci(int n){
        int a = 0;
        int b = 1;
        int t = 0;
        if(n == 0){
            return a;
        } else if (n == b) {
            return b;
        }
        else {
            for (int i = 2;i <= n; i++){
                t = (a + b);
                a = b;
                b = t;
            }
        }
        return t;
    }
}
