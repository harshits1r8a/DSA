package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_R8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Q8. Calculate Depreciation of Value

        DecimalFormat df =  new DecimalFormat();
        df.setMaximumFractionDigits(2);

        try{
            System.out.println("Enter initialValue, salvageValue and usefulLife : ");
            float initialValue = sc.nextFloat();
            float salvageValue = sc.nextFloat();
            float usefulLife = sc.nextFloat();

            float depreciableAmount = initialValue - salvageValue;
            float annualDepreciation =  depreciableAmount/usefulLife;

            System.out.println(" Annual Depreciation : "+ annualDepreciation);
        }catch (Exception e){
            System.out.println("Something Went Wrong");
        }
    }
}
