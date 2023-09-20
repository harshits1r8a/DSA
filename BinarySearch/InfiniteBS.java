package BinarySearch;

public class InfiniteBS {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println("Index : "+ ans(arr,target));
    }

    static int ans(int[] arr , int target){
        int s = 0;
        int e = 1;
        while(target > arr[e]){
            int newStart = e+1;
//            end = end + (size of chunk)*2;
            e = e + (e - s + 1) * 2;
            s = newStart;
        }
        return infBS(arr,target,s,e);
    }

    static int infBS(int[] arr, int target ,int s, int e){
        while(s <= e){
            int mid = s + (e - s) / 2;
            if( target < arr[mid]){
                e = mid-1;
            }else if(target > arr[mid]){
                s = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
