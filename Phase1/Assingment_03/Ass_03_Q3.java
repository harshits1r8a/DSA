package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_Q3 {
    public static void main(String[] args) {
//        Q3. Area Of Rectangle Program
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter length and breadth of rectangle :");
            float l = sc.nextFloat();
            float b = sc.nextFloat();

            if (l == b){
                System.out.println("This is not rectangle, it is square and its area :"+ l*b + "sq unit");
            }
            else {
                System.out.println("Area of rectangle:"+ l*b + "sq unit");
            }
        }catch(Exception e){
            System.out.println("Something wrong");
        }
    }
}
