package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q17 {
    public static void main(String[] args) {
        //Q16.Volume Of Cylinder Java Program
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14;

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);


        try{
            System.out.println("Enter radius  :");
            float r  = sc.nextFloat();
            System.out.println("Volume : " + df.format(((double) 4 /3)*pi*Math.pow(r,3)) +" cube unit");
        }catch(Exception e){
            System.out.println("Something Went wrong");
        }
    }
}
