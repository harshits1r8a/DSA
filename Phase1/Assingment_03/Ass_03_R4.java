package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_R4 {
    public static void main(String[] args) {
//        Q4. Calculate Discount Of Product
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        try{
            System.out.print("Enter original price : $");
            float originalPrice = sc.nextFloat();
            System.out.print("Enter discount Percentage : ");
            float discountPercentage = sc.nextFloat();
            float discountAmount = (originalPrice * discountPercentage) / 100;
            float discountPrice = originalPrice - discountAmount;
            System.out.println("Discount  Amount of "+ originalPrice+ " on percentage"+ discountPercentage+" : $"+ discountAmount );
            System.out.println("And Discount Price : $"+ discountPrice);
        }catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }
}
