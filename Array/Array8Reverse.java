package Array;

import java.util.Arrays;

public class Array8Reverse {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,8};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArr(int[] arr){
        for (int start = 0, end = arr.length-1; end > start ; start++ ,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
