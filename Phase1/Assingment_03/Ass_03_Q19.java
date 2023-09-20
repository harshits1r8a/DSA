package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q19. Curved Surface Area Of Cylinder. = 2πr × h = 2πrh.
        final double pi =  3.14;

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        try{
            System.out.println("Enter radius and height :");
            float r = sc.nextFloat();
            float h = sc.nextFloat();
            System.out.println("Curved Surface Area Of Cylinder : "+df.format(2*pi*r*h)+ " sq unit");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
