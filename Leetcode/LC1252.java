package Leetcode;

import java.util.Arrays;

public class LC1252 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};

        int[][] matx = new int[m][n];
        for(int[] elm : indices){
            int r = elm[0];
            int c = elm[1];

            for(int i = 0; i < n ; i++){
                matx[r][i] += 1;
            }
            for(int i = 0; i < m ; i++){
                matx[i][c] += 1;
            }
        }


        for(int[] elm : matx){
            System.out.println(Arrays.toString(elm));
        }

        int cnt = 0;
        for(int[] elm : matx){
            for(int e : elm){
                cnt += e%2==0?0:1;
            }
        }
        System.out.println(cnt);
    }
}
