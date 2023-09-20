package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q24 {
    public static void main(String[] args) {
        //Q24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner sc = new Scanner(System.in);
        try{
            int sum = 0;
            while(true){
                System.out.print("Enter a Integer : ");
                int n = sc.nextInt();
                sum += n;
                if (n == 0){
                    break;
                }
            }
            System.out.println("Sum of all integer : "+ sum);
        }catch (Exception e){
            System.out.println("Something went Wrong.");
        }
    }
}
