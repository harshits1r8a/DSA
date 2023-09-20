package Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int[] arr = new int[6];

        System.out.print("Enter element of arr : ");

//        input
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }

//        1 way to print
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

//        2 way to print
        for (int element : arr){
            System.out.print(element + " ");
        }

        System.out.println();

//        3 way to print
        System.out.println(Arrays.toString(arr));
    }
}
