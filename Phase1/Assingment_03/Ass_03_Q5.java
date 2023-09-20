package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q5 {
    public static void main(String[] args) {
//        Q5. Area Of Parallelogram
        Scanner sc  = new Scanner(System.in);

        try{
            System.out.println("Enter height and base of Parallelogram :");
            float h = sc.nextFloat();
            float b = sc.nextFloat();

            System.out.println("Area : "+(b*h) + " sq unit");
        }catch(Exception e){
            System.out.println("Something Went Wrong");
        }
    }
}
