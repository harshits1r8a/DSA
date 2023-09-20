package Leetcode;

public class LC1295 {
    //    HINT
    public static void main(String[] args) {
//        System.out.println(digit(5679345));
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    static int digit(int num){
        return (int)(Math.log10(num)+1);
    }

    static int findNumbers(int[] nums) {
        int cnt = 0;
        for ( int e : nums ){
            int Digit = (int)(Math.log10(e)+1);
            if ( Digit % 2 == 0){
                cnt++;
            }
        }
        return cnt;
    }
}
