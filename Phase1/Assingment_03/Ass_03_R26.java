package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumN = 0;
        int sumE = 0;
        int sumO = 0;
        while (true){
            System.out.print("Enter a integer : ");
            int n = sc.nextInt();
            if (n == 0){
                break;
            }else {
                if (n > 0){
                    if (n % 2 == 0){
                        sumE += n;
                    }else {
                        sumO += n;
                    }
                }else{
                    sumN += n;
                }
            }
        }
        System.out.println("Sum of negative no. : "+ sumN);
        System.out.println("Sum of positive no. : "+ (sumE+sumO));
        System.out.println("Sum of even no. : "+ sumE);
        System.out.println("Sum of odd no. : "+ sumO);
    }
}
