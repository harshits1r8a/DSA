package BinarySearch;

public class BSinInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3, 5, 7, 9, 10,13,23,32,36,39,45,57,64,79,88, 90, 100, 130, 140, 160, 170};
        int target = 56;
        System.out.println("Result : "+ BSinInfiniteSortedArr(arr,target,5));
    }

    public static int BSinInfiniteSortedArr(int[] arr, int target,int len) {
        int ans  = 0;
        int s = 0, e = s+(len-1);
        while(ans == 0){
            if( target >  arr[e]){
                s = e+1;
                e  = s+(len -1);
            }else{
                ans = BS(arr,target, s, e);
            }
        }
        return ans;
    }



    public static int BS(int[] arr, int target, int s ,int e){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            } else if (target > arr[mid]) {
                s = mid +1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
}
