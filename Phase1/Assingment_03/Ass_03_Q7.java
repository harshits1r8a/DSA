package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q7 {
    public static void main(String[] args) {
        //        Q7. Area Of Equilateral Triangle
        Scanner sc  = new Scanner(System.in);


        try{
            System.out.println("Enter side :");
            float a = sc.nextFloat();

            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);

            System.out.println("Area : "+ df.format((Math.sqrt(3)/4)*(Math.pow(a,2))) + " sq unit");
        }catch(Exception e){
            System.out.println("Something Went Wrong");
        }
    }
}
