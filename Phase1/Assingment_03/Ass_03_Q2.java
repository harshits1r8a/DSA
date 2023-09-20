package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q2 {
    public static void main(String[] args) {
//        Q2.Area Of Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height or base of triangle :");

        try{
            double h = sc.nextFloat();
            double b = sc.nextFloat();
            double area = (h*b)/2;
            System.out.println("Area of triangle : "+ area +" sq unit");
        }
        catch (Exception e){
            System.out.println("Something Went Wrong");
        }

    }
}
