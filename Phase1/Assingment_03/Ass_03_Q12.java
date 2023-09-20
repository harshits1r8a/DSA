package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q12 {
    public static void main(String[] args) {
        //        Q12.Perimeter Of  square
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Enter Side :");
            float a = sc.nextFloat();

            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);

            System.out.println("Perimeter : " + df.format(4*a) + " unit");
        } catch (Exception e) {
            System.out.println("Something Went Wrong");
        }
    }
}
