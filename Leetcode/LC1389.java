package Leetcode;

import java.util.Arrays;

public class LC1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        int[] index = {0,1,0};
        int[] result = createTargetArray(nums,index);
        System.out.println(Arrays.toString(result));
    }

    static int[] createTargetArray(int[] nums, int[] index){
        int[] ans = new int[nums.length];
        for (int i =  0 ; i < nums.length ; i++){
                for (int j = ans.length-1 ; j > index[i] ; j-- ){

                        ans[j] = ans[j-1];

                }
                ans[index[i]] = nums[i];
        }
        return ans;
    }
}
