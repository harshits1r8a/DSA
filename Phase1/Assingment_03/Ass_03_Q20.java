package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q20. Total Surface Area Of Cube.

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        try{
            System.out.println("Enter side :");
            float a = sc.nextFloat();
            System.out.println("Total Surface Area Of Cube : "+df.format(6*Math.pow(a,2))+ " sq unit");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
