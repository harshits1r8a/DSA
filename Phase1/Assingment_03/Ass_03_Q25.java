package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q25 {
    public static void main(String[] args) {
        //Q25. Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner sc = new Scanner(System.in);
        try{
//            int n = 1;
            int max = 0;
            while(true){
                System.out.print("Enter a Integer : ");
                int n = sc.nextInt();
                max = Math.max(n, max);
                if (n == 0){
                    break;
                }
            }
            System.out.println("Sum of all integer : "+ max);
        }catch (Exception e){
            System.out.println("Something went Wrong.");
        }
    }
}
