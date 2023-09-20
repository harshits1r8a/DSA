package Phase1.Assingment_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ass_03_R23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter leap year : ");
        int year = sc.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year+"  is  leap year");
                }else {
                    System.out.println(year+"  is not leap year");
                }
            }else{
                System.out.println(year+"  is  leap year");
            }
        }else {
            System.out.println(year+"  is not leap year");
        }
    }
}
