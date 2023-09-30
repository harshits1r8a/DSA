package BS_Question;

public class GFGq1 {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5};
        System.out.println(countRotation(arr));
    }


    static int countRotation(int[] arr){
        int pivotInd = pivot(arr);
        return  pivotInd+1;
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
            }else if(arr[mid] < arr[mid+1] && arr[mid] < arr[mid-1]){
                return mid-1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
