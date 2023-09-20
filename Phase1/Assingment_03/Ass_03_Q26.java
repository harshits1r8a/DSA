package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_Q26 {
    public static void main(String[] args) {
        //Q26. Addition Of Two Numbers
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        try{
            System.out.println("Enter two number for addition : ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println("Sum of two number : "+ df.format(a+b));
        }catch (Exception e){
            System.out.println("Something Went Wrong");
        }
    }
}
