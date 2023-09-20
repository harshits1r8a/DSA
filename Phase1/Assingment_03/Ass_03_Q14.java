package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q14 {
    public static void main(String[] args) {
        //Q14.Volume Of Cone Java Program
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14;

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);


        try{
            System.out.println("Enter radius and height :");
            float r  = sc.nextFloat();
            float h  = sc.nextFloat();
            System.out.println("Volume : " + df.format(pi*Math.pow(r,2)*(h/3)) +" cube unit");
        }catch(Exception e){
            System.out.println("Something Went wrong");
        }
    }
}
