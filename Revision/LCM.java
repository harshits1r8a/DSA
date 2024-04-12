package Revision;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers for find LCM : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max  = num1>num2? num1:num2;
        int maxNum = max;
        int max2 = Math.max(num1,num2);
        System.out.println(max2);

        while(!(max % num1 == 0 && max % num2 == 0)){
            max+=maxNum;
        }

//        System.out.println(String.format("LCM of %d and %d = %d",num1,num2,max));
        System.out.printf("LCM of %d and %d = %d%n",num1,num2,max);
        System.out.printf("LCM of {0} and {1} = {3}",num1,num2,max);

    }
}
