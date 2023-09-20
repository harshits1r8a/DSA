package Phase1;

import java.util.Scanner;

public class V9_Q5RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reverse of " + num + " : " + revNum(num));
    }

    static int revNum(int n) {
        int rev = 0;
        while(n>0){
            int rem = n % 10;
            rev = rem + (rev * 10);
            n = n / 10;
        }
        return rev;
    }
}
