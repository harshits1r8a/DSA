package Phase1.Assingment_03;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_R6 {
    public static void main(String[] args) {
//        Q6. Calculate Commission Percentage
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        try{
            System.out.print("Enter Total amount : ");
            float totalAmm = sc.nextFloat();
            System.out.print("Enter Total Commission rate : ");
            float commRate = sc.nextFloat();

            float commAmm = totalAmm*(commRate/100);
            float commPercentage = (commAmm/totalAmm)*100;

            System.out.println("Commission amount : " + commAmm);
            System.out.println("Commission Percentage : " + commPercentage);
        }catch(Exception e){
            System.out.println("Something Went Wrong.");
        }
    }
}
