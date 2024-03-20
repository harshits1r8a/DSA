package Leetcode;

import java.util.Arrays;

public class LC100243Elminto2arr {
    public static void main(String[] args) {
        int[] nums = {5,4,3,8};
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int k = 0, l = 0;

        for(int i = 0 ; i < nums.length; i++){
            if(i == 0){
                arr1[k] = nums[i];
                k++;
            }else if(i == 1){
                arr2[l] = nums[i];
                l++;
            }else{
                if(arr1[k-1] > arr2[l-1]){
                    arr1[k] = nums[i];
                    k++;
                }else{
                    arr2[l] = nums[i];
                    l++;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(k);
        System.out.println(Arrays.toString(arr2));
        System.out.println(l);

        for(int i = k,j = 0; i< arr1.length; i++,j++){
            arr1[i] = arr2[j];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
