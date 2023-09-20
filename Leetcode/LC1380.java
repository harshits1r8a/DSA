package Leetcode;

public class LC1380 {
    public static void main(String[] args) {
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(arr));
    }

    static int luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int ans = 0;
        for ( int r = 0 ; r < n ; r++){
            int c ;
            for ( c = 0 ; c < matrix[r].length ; c++){
                for ( int i = 1 ; i < matrix[r].length ; i++){
                    if ( matrix[r][c] < matrix[r][i]){
                        c=i;
                    }
                }
            }
            ans = matrix[r][c];
            for ( int i = r+1 ; i < n ; i++){
                if ( matrix[i][c] > ans){
                    break;
                }
            }
        }

        return ans;
    }
}
