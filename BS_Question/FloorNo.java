package BS_Question;

public class FloorNo {
    public static void main(String[] args) {
        int[] arr = {1,5,9,12,16,18,37,66};
        int target = 17;
        System.out.println("Ceiling num of "+target+" is : "+ floorNo(arr,target));
    }

    static  int floorNo(int[] arr , int target){
        int s = 0;
        int e = arr.length-1;

        while ( s <= e){
            int mid = s+(e-s)/2;

            if ( arr[mid] == target){
                return arr[mid];
            }
            if( arr[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }

        }
        return arr[e];
    }
}
