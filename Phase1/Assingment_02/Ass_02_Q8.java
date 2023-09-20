package Phase1.Assingment_02;

import java.util.Scanner;

public class Ass_02_Q8 {
    public static void main(String[] args) {
//        8.To find out whether the given String is Palindrome or not.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder str2 = new StringBuilder(); // It creates an empty String Builder with initial capacity of 16
        char ch;
        for (int i = (str.length()-1) ; i >= 0  ; i--){
            ch = str.charAt(i);
            str2.append(ch);
        }
        if (str.contentEquals(str2)){
            System.out.println(str + " is palindrome");
        }
        else {
            System.out.println(str + " is not palindrome");
        }
    }
}
