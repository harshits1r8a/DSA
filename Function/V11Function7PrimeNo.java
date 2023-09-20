package Function;

import java.util.Scanner;

public class V11Function7PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = in.nextInt();
        System.out.println(isprime(num));

    }

    private static boolean isprime(int num) {
        if(num < 2){
            return false;
        }
        for (int i = 2 ; i*i < num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
