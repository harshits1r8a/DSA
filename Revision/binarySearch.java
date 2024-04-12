package Revision;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,23,45,68,90,123};
        int target = 49;
        System.out.println(binarysearch(arr,target));
    }

    static int binarysearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
