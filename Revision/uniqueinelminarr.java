package Revision;

import java.util.Arrays;

public class uniqueinelminarr {
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,3,3,3,4,6,8,8,8,9};
        int j = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }else{
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(j);
    }
}
