package Leetcode;

import java.util.Arrays;

public class LC59SpiralMat2 {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n];
        int top = 0 ,bottom = n-1;
        int left = 0 ,right = n-1;

        int elm = 1;

        while(top <= bottom && left <= right){


            for(int i = left ; i <= right; i++){
                arr[top][i] = elm;
                elm++;
            }
            top++;

            for(int i = top ; i <= bottom; i++){
                arr[i][right] = elm;
                elm++;
            }
            right--;

            if(top <= bottom){
                for(int i = right ; i >= left; i--){
                    arr[bottom][i] = elm;
                    elm++;
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom ; i >= top; i--){
                    arr[i][left] = elm;
                    elm++;
                }
                left++;
            }

        }

        for(int[] e : arr){
            System.out.println(Arrays.toString(e));
        }
    }
}
