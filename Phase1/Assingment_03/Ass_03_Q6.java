package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q6 {
    public static void main(String[] args) {
//        Q6. Area Of rhombus
        Scanner sc  = new Scanner(System.in);


        try{
            System.out.println("Enter diagonals  of Rhombus :");
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();

            System.out.println("Area : "+(d1*d2)/2 + " sq unit");
        }catch(Exception e){
            System.out.println("Something Went Wrong");
        }
    }
}
