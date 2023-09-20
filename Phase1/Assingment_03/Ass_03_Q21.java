package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q21 {
    public static void main(String[] args) {
        //Q21. Fibonacci Series In Java Programs

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter n no. for n-fibonacci series : ");
            int n = sc.nextInt();
            int n1 = 0;
            int n2 = 1;
            int next = 0;

            for (int i = 0 ; i <= n ; i++){
                if (i <= 1){
                    System.out.print( i + " ");
                }
                else{
                    next = n1 + n2;
                    n1 = n2;
                    n2 = next;
                    System.out.print(next+ " ");
                }
            }
        }catch (Exception e){
            System.out.println("Something went Wrong.");
        }
    }
}
