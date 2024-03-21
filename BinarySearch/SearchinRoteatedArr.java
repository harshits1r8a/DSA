package BinarySearch;

public class SearchinRoteatedArr {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findPivot(nums));
    }

//    find the pivot
    static  int findPivot(int[] arr){
        int s = 0, e = arr.length-1;

        while(s <= e ){
            int mid = s+(e-s)/2;
//            4 cases
            if( mid < e && arr[mid] > arr[mid+1]){
                return mid;
            } else if (mid > s && arr[mid] < arr[mid-1]) {
                return mid-1;
            } else if (arr[0] >= arr[mid]) {
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
}
