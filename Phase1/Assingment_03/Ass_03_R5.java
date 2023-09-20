package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ass_03_R5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);


        try{
            System.out.println("Enter fist point  x and y :");
            float x1 = sc.nextFloat();
            float y1 = sc.nextFloat();
            System.out.println("Enter second point  x and y :");
            float x2 = sc.nextFloat();
            float y2 = sc.nextFloat();

            float X = (x2-x1);
            float Y = (y2-y1);

            double dis = Math.sqrt(X*X+Y*Y);
            System.out.println("Distance b/w point ("+x1+","+y1+") and ("+x2+","+y2+") :"+ df.format(dis) + " unit");


        }catch (Exception e){
            System.out.println("Something went wrong !");
        }
    }
}
