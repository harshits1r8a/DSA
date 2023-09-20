package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_R3 {
    public static void main(String[] args) {

//        Q3.Avg of n numbers
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        int sum = 0;

        try{
            System.out.print("Enter integer : ");
            int n = sc.nextInt();

            for (int i = 1 ; i <= n ; i++){
                sum += i;
            }
            System.out.println("Avg of "+n+" : "+ df.format((sum/n)));
        }catch(Exception e){
            System.out.println("Something Went Wrong.");
        }

    }
}
