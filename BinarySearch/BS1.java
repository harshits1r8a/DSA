package BinarySearch;

public class BS1 {
    public static void main(String[] args) {
        int[] arr = {12,43,65,74,87,90,95,110};
        int target = 95;
        System.out.println("Index of "+target+ " element is : "+ binarySearch(arr, target));
    }


    //return index
    // return -1 if element not present
    static int binarySearch(int[] arr , int target){
        int s = 0;
        int e = arr.length-1;
        while ( s <= e){
            int mid = s + ( e - s)/2;

            if ( target == arr[mid]){
                return mid;
            } else if ( target > arr[mid]) {
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
}
