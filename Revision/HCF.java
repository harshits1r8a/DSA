package Revision;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num1  = 399;
        int num2 = 437;

        while( num1 != 0 && num2 != 0){
            if(num1 > num2){
                num1 %= num2;
            }else{
                num2 %= num1;
            }
        }

        int result = num1 == 0 ? num2 : num1;
        System.out.printf("HCF  : %d%n",result);
    }
}
