package Revision;

import java.util.Scanner;

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "HAH";
        StringBuilder str2 = new StringBuilder();
        char ch ;

        for(int i = str.length()-1 ; i >=  0 ; i-- ){
            ch = str.charAt(i);
            str2.append(ch);
        }

        boolean result = str.contentEquals(str2);
        if(result){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
