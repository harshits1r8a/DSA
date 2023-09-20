package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer :");
        int n = sc.nextInt();
        int sum = 0;
        int s = n;
        while (s > 0){
            int rem = s % 10;
            sum += rem;
            s /= 10;
        }
        System.out.println("Sum of inger's digit :"+ sum);
    }
}
