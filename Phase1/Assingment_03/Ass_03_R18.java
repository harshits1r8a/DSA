package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = sc.nextDouble();
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        System.out.print("Enter the number of years: ");
        int numberOfYears = sc.nextInt();

        System.out.print("Enter the number of compounding periods per year: ");
        int compoundingPeriods = sc.nextInt();

        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate / compoundingPeriods, numberOfYears * compoundingPeriods);

        System.out.println("Future value: " + futureValue);
    }
}
