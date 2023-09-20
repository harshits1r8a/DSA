package BinarySearch;

public class BS2OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {110,97,85,76,56,46,31,10,-12,-23};
        int target = 97;
        System.out.println("Index of "+target+ " element is : "+ binarySearch(arr, target));
    }


    //return index
    // return -1 if element not present
    static int binarySearch(int[] arr , int target){
        int s = 0;
        int e = arr.length-1;
        boolean isAcd = arr[s] < arr[e];
        while ( s <= e){
            int mid = s + ( e - s)/2;

            if ( target == arr[mid]){
                return mid;
            }
            else{
                if (isAcd ){
                    if ( target > arr[mid]) {
                        s = mid+1;
                    }else{
                        e = mid-1;
                    }
                }
                else{
                    if ( target > arr[mid]) {
                        e = mid-1;
                    }else{
                        s = mid+1;
                    }
                }
            }
        }
        return -1;
    }
}
