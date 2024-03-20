package Leetcode;
import java.util.*;
public class LS989 {
    public static void main(String[] args) {
        int[] num = {0};
        int k = 23;
//        int len = (int)(Math.log10(k)+1);
        List<Integer> ls = new ArrayList<>();
        for(int i = num.length-1; i >=0; i--){
            int rem = k%10;
            if(num[i]+rem < 10){
                ls.add(0,num[i]+rem);
            }else{
                ls.add(0, (num[i]+rem)%10);
                if(i-1 < 0){
                    ls.add(0, (num[i]+rem)/10);
                }else{
                    num[i-1] +=(num[i]+rem)/10;
                }
            }
            k /=10;
        }

//        if((int)(Math.log10(k)+1)!=0){
//            for(int i = (int)(Math.log10(k)+1)-1; i >=0; i--){
//                ls.add(0,k%10);
//                k/=10;
//            }
//        }

        while(k>0){
            ls.add(0,k%10);
            k/=10;
        }

//        wrong approch
        System.out.println(ls);
    }




}
