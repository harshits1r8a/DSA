package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_R11 {
    public static void main(String[] args) {
//        A = P(1 + {r}/{n})^{nt}
//        A	=	final amount
//        P	=	initial principal balance
//        r	=	interest rate
//        n	=	number of times interest applied per time period
//        t	=	cc

        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        try{
            System.out.print("Enter Principle balance : ");
            float p = sc.nextFloat();
            System.out.print("Enter rate : ");
            float r = sc.nextFloat()/100;
            System.out.print("Enter number of times interest applied per time period : ");
            float n = sc.nextFloat();
            System.out.print("Enter number of times interest applied per time period : ");
            float t = sc.nextFloat();

            float a = (float) (p*Math.pow((1 + (r/n)),n*t));
            System.out.println("SI : "+ df.format(a));
        }catch (Exception e ){
            System.out.println("Something Went Wrong");
        }
    }
}
