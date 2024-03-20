package Leetcode;
import java.lang.String;
public class LC100236 {
    public static void main(String[] args) {
        String s = "abada";
        char c = 'a';

//        int cnt = 0;
//        for(int i = 0 ; i < s.length(); i++){
//            if(s.charAt(i) == c.charAt(0)){
//                for(int j = i; j < s.length(); j++){
//                    if(s.charAt(j) == c.charAt(0)){
//                        cnt++;
//                    }
//                }
//            }
//        }

        int cnt = 0;
        int i = 0;
        int j = i;

        while(i < s.length()){
            if(s.charAt(i) == c && j< s.length()){
                if(s.charAt(j) == c){
                    cnt++;
                }
                j++;
            }else{
                i++;
                j = i;
            }
        }

        System.out.println(cnt);
    }
}
