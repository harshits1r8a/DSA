package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q23 {
    public static void main(String[] args) {
        //Q23. Input a number and print all the factors of that number (use loops).
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter number :");
            int n = sc.nextInt();

            for (int i = 1 ; i < n ; i++){
                if (n % i == 0){
                    System.out.print(i+", ");
                }

            }
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
