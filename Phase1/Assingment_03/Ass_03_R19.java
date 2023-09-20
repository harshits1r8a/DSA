package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no. : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2st no. : ");
        int n2 = sc.nextInt();
        int max = Math.max(n1,n2);

        while(true){
            if(max % n1 == 0 && max  % n2 == 0){
                System.out.println(max + " LCM of "+ n1 + " and "+ n2);
                break;
            }
            max++;
        }
    }
}