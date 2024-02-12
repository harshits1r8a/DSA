package Phase1.Assingment_02;

import java.util.Scanner;

public class Ass_02_Q9 {
    public static void main(String[] args) {
//        9.To find Armstrong Number between two given number.
        System.out.println("Enter your range :");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        for(int i = n1 ; i <= n2 ; i++){
            int num = i;
            int orignalNum = i;
            int digit = String.valueOf(i).length();
//            int digit = (int)(Math.log10(num)+1);
            int res = 0;
            while (num > 0){
                int rem = num % 10;
                res += Math.pow(rem,digit);
                num /= 10;
            }
            if (orignalNum == res){
                System.out.print(orignalNum + " ");
            }
        }
    }
}
