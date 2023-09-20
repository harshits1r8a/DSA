package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q16 {
    public static void main(String[] args) {
        //Q16.Volume Of Cylinder Java Program
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14;

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);


        try{
            System.out.println("Enter radius and height :");
            float r  = sc.nextFloat();
            float h  = sc.nextFloat();
            System.out.println("Volume : " + df.format(pi*Math.pow(r,2)*h) +" cube unit");
        }catch(Exception e){
            System.out.println("Something Went wrong");
        }
    }
}
