package Function_Assignment;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = in.nextInt();
        System.out.println(isPalindrom(num));
    }

    private static boolean isPalindrom(int num) {
        int n = num;
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = (rev*10) + rem;
            n /= 10;
        }

        return rev == num;
    }
}
