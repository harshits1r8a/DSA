package Leetcode;

public class LC33 {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 5;
        int maxInd = pivot(nums);
        int result = BS(nums,target,maxInd+1,nums.length-1);
        if(result == -1){
            result =  BS(nums,target,0,maxInd);
        }
        System.out.println(result);
    }

    static int pivot(int[] arr){
        if(arr.length ==1){
            return 0;
        }
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] < arr[mid+1]){
                if(arr[mid] > arr[arr.length-1]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }else if(arr[mid] < arr[mid+1] && arr[mid] <arr[mid-1]){
                return mid-1;
            }else{
                return mid;
            }

        }
        return -1;
    }


    static int BS(int[] arr, int target,int s,int e ){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>target){
                e = mid-1;
            }else if(arr[mid]<target){
                s=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
