package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q4 {
    public static void main(String[] args) {
//        Q.4 Area Of Isosceles Triangle
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter height and base of isosceles triangle :");
            float h = sc.nextFloat();
            float b = sc.nextFloat();

            System.out.println("Area : "+(b*h)/2 + " sq unit");
        }catch(Exception e){
            System.out.println("Something Went Wrong");
        }
    }
}
