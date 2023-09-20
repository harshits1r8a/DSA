package Phase1.Assingment_03;

import java.util.Scanner;

public class Ass_03_R16 {
    public static void main(String[] args) {

        //Reverse A String In Java

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :");
        String str = sc.next();
        StringBuilder revStr = new StringBuilder();

        try{
            for (int i = str.length() ; i > 0 ; i--){
                char ch = str.charAt(i-1);
                revStr.append(ch);
            }
            System.out.println("Reverse String : "+ revStr);
        }catch (Exception e){
            System.out.println("Something went Wrong");
        }
    }
}
