package Leetcode;

import java.util.*;

public class LC100246Elminto2arrII {
    public static void  main(String[] args) {
        int[] nums = {2,1,3,3};
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();

        for(int i = 0 ; i < nums.length; i++){
            if(i == 0){
                ls1.add(nums[i]);
            }else if(i == 1){
                ls2.add(nums[i]);
            }else{
                if(greaterCount(ls1, nums[i]) > greaterCount(ls2, nums[i])){
                    ls1.add(nums[i]);
                } else if (greaterCount(ls1, nums[i]) < greaterCount(ls2, nums[i])) {
                    ls2.add(nums[i]);
                }else{
                    if(ls1.size() == ls2.size()){
                        ls1.add(nums[i]);
                    } else if (ls1.size() < ls2.size()){
                        ls1.add(nums[i]);
                    }else{
                        ls2.add(nums[i]);
                    }
                }
            }
        }

//        System.out.println(ls1);
//        System.out.println(ls2);
        ls1.addAll(ls2);
//        System.out.println(ls1);


        int[] ans = new int[nums.length];
        for(int i = 0 ; i < ans.length; i++){
            ans[i] = ls1.get(i);
        }

        System.out.println(Arrays.toString(ans));
    }

    static int greaterCount(ArrayList<Integer> arr, int val){
        int cnt = 0;
        for (Integer integer : arr) {
            if (integer > val) {
                cnt++;
            }
        }
        return cnt;
    }
}
