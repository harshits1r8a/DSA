package Phase1.Assingment_03;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_R9 {
    public static void main(String[] args) {
//        Calculate Batting Average

        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        try{
            System.out.println("Enter player total score and time of out : ");
            int score = sc.nextInt();
            int timesOut = sc.nextInt();

            if (timesOut == 0){
                System.out.println("Now we can't calculate Batting Average");
            }else {
                double battAvg = (double) score /timesOut;
                System.out.println("Batting average : "+ df.format(battAvg));
            }

        }catch (Exception e){
            System.out.println("Something Went Wrong Try Again...");
        }
    }
}
