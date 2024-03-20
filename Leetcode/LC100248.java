package Leetcode;

public class LC100248 {
    public static void main(String[] args) {
        String s = "ausoee";


        String revStr = new StringBuilder(s).reverse().toString();
        for(int i = 0 ; i <= s.length()-2 ; i++ ){
            if(revStr.contains(s.substring(i,i+2))){
                System.out.println(true);
            }
        }
        System.out.println("end");
    }
}
