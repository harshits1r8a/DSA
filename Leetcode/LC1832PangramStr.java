package Leetcode;

import java.util.*;

public class LC1832PangramStr {
    public static void main(String[] args) {
        List<Character> alfa = new ArrayList<>();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence1 = "leetcode";
        System.out.println(panGram(sentence));
        System.out.println(panGram(sentence1));

        System.out.println(panGram2(sentence));
        System.out.println(panGram2(sentence1));

        System.out.println(sentence.length());
        System.out.println(sentence1.indexOf('a'));


    }

    private static boolean panGram(String sentence){
        int cnt = 0;
        for(char ch = 'a'; ch <='z'; ch++){
            for(int i = 0; i < sentence.length() ;i++){
                if(ch == sentence.charAt(i)){
                    cnt++;
                    break;
                }
            }
        }

        return cnt == 26;
    }

    private static  boolean panGram2(String str){
        for (char i = 'a'; i <= 'z'; i++) {
            if (str.indexOf(i) < 0)
                return false;
        }
        return true;
    }
}
