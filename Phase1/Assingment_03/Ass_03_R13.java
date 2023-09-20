package Phase1.Assingment_03;

import java.security.cert.Extension;
import java.util.Scanner;

public class Ass_03_R13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        try{
            System.out.println("Enter value on n :");
            int n = sc.nextInt();

            for (int i = 1 ; i <= n ; i++){
                sum += i;
            }
            System.out.println("Sum : "+sum);
        }catch (Exception e){
            System.out.println("Something Went wrong");
        }
    }
}
