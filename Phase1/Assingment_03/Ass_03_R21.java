package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        try{
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                System.out.println(ch + " is vowel.");
            }else {
                System.out.println(ch + " is constant.");
            }
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
