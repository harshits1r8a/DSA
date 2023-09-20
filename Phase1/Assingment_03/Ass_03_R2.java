package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

//        Q2. Calculate Electricity Bill
        float ratePerUnit = 0.10f ;
        float fixedRate = 50f ;

        try{
            System.out.print("Enter Consumed Unit :");
            float consumedUnit = sc.nextFloat();
            float energyCharge = consumedUnit * ratePerUnit;
            float totalCharge = energyCharge + fixedRate;
            System.out.println("Consumer Electricity Bill Amount : $"+ totalCharge);
        }catch (Exception e){
            System.out.println("Some thing wrong");
        }
    }
}
