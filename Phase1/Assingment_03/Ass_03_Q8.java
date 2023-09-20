package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q8 {
    public static void main(String[] args) {
        //        Q8.Perimeter Of Circle
        final double pi = 3.14;
        Scanner sc  = new Scanner(System.in);


        try{
            System.out.println("Enter radius :");
            float r = sc.nextFloat();

//            DecimalFormat df = new DecimalFormat();
//            df.setMaximumFractionDigits(2);
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);

            System.out.println("Perimeter : "+ df.format(2*pi*r) + " unit");
        }catch(Exception e){
            System.out.println("Something Went Wrong");
        }
    }
}
