package BS_2DArray;

import java.util.Arrays;

public class BS_2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        int target = 41;
        System.out.println(Arrays.toString(search2D(arr,target)));
    }

//    static int[] search2D(int[][] arr, int target){
//        for(int i = 0; i <arr.length; i++){
//            int s = 0;
//            int e = arr[i].length;
//            while(s < e){
//                int mid = s+(e-s)/2;
//                if(arr[i][mid] == target){
//                    return new int[]{i,mid};
//                }
//                if(arr[i][mid] > target){
//                    e = mid-1;
//                }else{
//                    s = mid+1;
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

    static int[] search2D(int[][] arr, int target){
        int r = 0 ;
        int c = arr[r].length - 1;
        while( r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
