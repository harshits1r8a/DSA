package Leetcode;

public class LC1095SecApproch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int n = arr.length;
        int indMax = peakIndexInMountainArray(arr);
        int ansLeft = BS(arr,target,0,indMax);
        int ansRight = BS(arr,target,indMax,n-1);
        if(ansLeft != -1){
            System.out.println(ansLeft);
        }else {
            System.out.println(ansRight);
        }

    }

    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid] > arr[mid+1]){
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return s;
    }

    static int BS(int[] arr , int target  ,int s, int e){
        while(s < e){
            int mid = s+(e-s)/2;
            if(arr[s] < arr[e]){
                if(arr[mid] > target){
                    e = mid-1;
                } else if (arr[mid]< target) {
                    s = mid+1;
                }else{
                    return mid;
                }
            }else{
                if(arr[mid] > target){
                    s = mid-1;
                } else if (arr[mid]< target) {
                    e = mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
