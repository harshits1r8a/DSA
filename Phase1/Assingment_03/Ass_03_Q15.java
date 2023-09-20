package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q15 {
    public static void main(String[] args) {
        //Q15.Volume Of Prism Java Program
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);


        try{
            System.out.println("Enter area of base and height :");
            float b  = sc.nextFloat();
            float h  = sc.nextFloat();
            System.out.println("Volume : " + df.format(b*h) +" cube unit");
        }catch(Exception e){
            System.out.println("Something Went wrong");
        }
    }
}
