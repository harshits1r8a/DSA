package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer check weather no is palindrome or not :");
        int n = sc.nextInt();
        int n1 = n;
        int rev = 0;
        while(n1 > 0){
            int rem = n1 % 10 ;
            rev = rem + (rev*10);
            n1 /= 10;
        }
        if (n == rev){
            System.out.println(n+" is palindrome.");
        }else {
            System.out.println(n+" is not palindrome.");
        }
    }
}
