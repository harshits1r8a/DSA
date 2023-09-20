package Phase1.Assingment_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ass_03_R10 {
    public static void main(String[] args) {
//        Calculate CGPA Java Program
        double totalGradPoint = 0;
        int totalCreditHour = 0;
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        try{
            System.out.print("Enter the total no. of course :");
            int totalCourse = sc.nextInt();

            for (int i = 1; i<= totalCourse ; i++){
                System.out.println("\nCourse"+i+" : ");
                System.out.print("Enter the credit hours for the course :");
                int creditHours = sc.nextInt();
                System.out.print("Enter the Grade points for the course : ");
                double gradePoints = sc.nextDouble();

                totalCreditHour += creditHours;
                totalGradPoint += gradePoints*creditHours;
            }
            double CGPA = totalGradPoint/totalCreditHour;
            System.out.println("CGPA : "+df.format(CGPA));
        }catch (Exception e){
            System.out.println("Something Went Wrong");
        }
    }
}
