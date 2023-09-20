package LinearSearch;

import java.util.Arrays;

public class LinSer4MulDimArr {
    public static void main(String[] args) {
        int[][] arr = {
                {12,34,56,78},
                {1,5,8},
                {11,24,26,37,9,10},
                {98,65,-23}
        };

        int target = 99;
        System.out.println(Arrays.toString(search2D(arr,target)));
        System.out.println(minimum(arr));
    }

    static  int[] search2D(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1,-1};
        }

        for (int row = 0 ; row < arr.length ; row++ ){
            for (int col = 0 ; col < arr[row].length ; col++ ){
                if ( target == arr[row][col] ){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static  int minimum(int[][] arr){
//        int min = arr[0][0];
        int min = Integer.MAX_VALUE;
//        for (int row = 0 ; row < arr.length ; row++ ){
//            for (int col = 0 ; col < arr[row].length ; col++ ){
//                if ( arr[row][col] < min ){
//                    min = arr[row][col];
//                }
//            }
//        }

        for (int[] row: arr) {
            for (int col : row) {
                if (col < min){
                    min = col;
                }
            }
        }
        return min;
    }
}
