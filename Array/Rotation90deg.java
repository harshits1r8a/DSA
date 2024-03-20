package Array;

import java.util.Arrays;

public class Rotation90deg {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };

        int[][] arr = {{1,2},
                       {3,4}};
        transpose(arr);
        reverseMatRow(arr);
        for (int[] elm : arr) {
            System.out.println(Arrays.toString(elm));
        }


    }


    static void transpose(int[][] mat){
        int n = mat.length;
        for (int i = 0; i <= n-2; i++){
            for(int j =i+1 ; j <= n-1; j++){
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
//        return mat;
    }

    static void reverseMatRow(int[][] mat){
        int n = mat.length;
        for (int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n/2; j++){
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
//        return mat
    }

}
