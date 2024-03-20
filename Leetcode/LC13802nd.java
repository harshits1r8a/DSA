package Leetcode;

public class LC13802nd {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{14,12,17}};
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0 ; i < m; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = 0;

            for(int j =0 ; j < n; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }

            boolean isTrue = true;

            for(int j = 0 ; j < m; j++){
                if(min < matrix[j][minIndex]){
                    isTrue = false;
                    break;
                }
            }

            if(isTrue){
                System.out.println(min);
            }
        }




    }
}
