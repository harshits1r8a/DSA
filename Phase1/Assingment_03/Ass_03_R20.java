package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter first no.: ");
            int n1 = sc.nextInt();
            System.out.print("Enter second no.: ");
            int n2 = sc.nextInt();
            int max = Math.max(n1, n2);
            int small = (n1+n2)-max;

            while (true){
                int rem = max % small;
                if (rem == 0){
                    break;
                }
                max   = small;
                small = rem;
            }
            System.out.println("HCF of "+ n1 + " and "+n2+ " : "+small);

        }catch (Exception e){
            System.out.println("Something went wrong ! ");
        }
    }
}
