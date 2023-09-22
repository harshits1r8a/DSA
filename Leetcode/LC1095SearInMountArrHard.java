package Leetcode;

public class LC1095SearInMountArrHard {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        int target = 3;
        int n = arr.length;
        int indMax = peakIndexInMountainArray(arr);
        int ansLeft = BS(arr,target,true,0,indMax);
        int ansRight = BS(arr,target,false,indMax,n-1);
        if(ansLeft < ansRight && ansLeft != -1){
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

    static int BS(int[] arr , int target , boolean isLeft ,int s, int e){
        int ans = -1;
        while( s <= e){
            int mid = s +(e-s)/2;
            if ( target < arr[mid]){
                e = mid-1;
            }else if(target > arr[mid]){
                s = mid+1;
            }else{
                ans = mid;
                if(isLeft){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
        }
        return ans;
    }
}
