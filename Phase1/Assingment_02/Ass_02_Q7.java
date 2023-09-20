package Phase1.Assingment_02;

import java.util.Scanner;

public class Ass_02_Q7 {
    public static void main(String[] args) {
//        7. To calculate Fibonacci Series up to n numbers.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int next = 0;
        for (int i = 0 ; i <= n; i++){
            if (i == 0){
                System.out.print(num1 +" ");
            }if (i == 1){
                System.out.print(num2 +" ");
            }
            else {
                next = num1 + num2;
                num1 = num2;
                num2 = next;
                System.out.print(next + " ");
            }
        }
    }
}
