package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array3MultiDimentional {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
//        int[][] arr = {
//                {1,1,2,3},
//                {12,2,4,6},
//                {8,9}
//        };
//
//        System.out.println(arr[0][0]);
//        System.out.println(Arrays.toString(arr[1]));
//
//        for (int[] e : arr) {
//            System.out.println(Arrays.toString(e));
//        }

//        --------------------------------------------
//        input
        int[][] arr2 = new int[3][3];
        System.out.println(arr2.length);

        for (int row = 0 ; row < arr2.length ; row++){
            for (int col = 0 ; col < arr2[row].length ; col++){
                arr2[row][col] = in.nextInt();
            }
        }

//        output
        for (int row = 0 ; row < arr2.length ; row++){
            for (int col = 0 ; col < arr2[row].length ; col++){
                System.out.print(arr2[row][col]+ " ");
            }
            System.out.println();
        }

        for (int row = 0 ; row < arr2.length ; row++){
            System.out.println(Arrays.toString(arr2[row]));
        }

        for (int[] e : arr2){
            System.out.println(Arrays.toString(e));
        }
    }

}
