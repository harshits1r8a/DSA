package Leetcode;

public class LC53_24 {
    public static void main(String[] args) {
        int[] nums = {-1};
        System.out.println(maxSubArray(nums));

    }

    static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE ;
        int n = nums.length;
        for ( int i = 0 ; i < n ; i++){
            for (int j = i ; j < n ; j++){
                int sum = 0;
                for ( int k = i ; k <= j ; k++){
                    sum += nums[k];
                }
                if ( max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }
}
