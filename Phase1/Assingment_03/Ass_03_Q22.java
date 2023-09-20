package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q22 {
    public static void main(String[] args) {
        //Q22. Subtract the Product and Sum of Digits of an Integer
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter Integer. :");
            int n = sc.nextInt();
            int pod = 1;
            int sod = 0;
            while(n > 0){
                int rem = n % 10;
                pod *= rem;
                sod += rem;
                n /= 10;
            }
            System.out.println("Subtract the Product and Sum of Digits of an Integer : "+ (pod-sod));
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
