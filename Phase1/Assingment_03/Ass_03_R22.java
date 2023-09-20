package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Perfect Number In Java

        System.out.print("Enter a integer : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n ; i++){
            if (n %  i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println(n + " is perfect number");
        }else{
            System.out.println(n + " is not perfect number");
        }
    }
}
