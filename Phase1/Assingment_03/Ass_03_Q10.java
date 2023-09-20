package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q10 {
    public static void main(String[] args) {
        //        Q10.Perimeter Of  Parallelogram
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Enter Side and Base :");
            float a = sc.nextFloat();
            float b = sc.nextFloat();

            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);

            System.out.println("Perimeter : " + df.format(2*(a+b)) + " unit");
        } catch (Exception e) {
            System.out.println("Something Went Wrong");
        }
    }
}
