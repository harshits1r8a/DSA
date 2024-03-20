package Leetcode;

import java.util.Arrays;

public class LC1886 {
    public static void main(String[] args) {
//        int[][] mat = {{0,0,0},
//                       {0,1,0},
//                       {1,1,1}},
//                target = {{1,1,1},
//                          {0,1,0},
//                          {0,0,0}};

//        int[][] mat = {{0,1},{1,0}}, target = {{1,0},{0,1}};



//        int[][] mat = {{0,1},{1,1}}, target = {{1,0},{0,1}};


        int[][] mat = {{0,1,1,0},{1,0,0,1},{0,1,0,1},{0,0,1,0}}, target = {{0,1,0,0},{1,0,1,0},{1,0,0,1},{0,1,1,0}};


//        ***************** Wrong approch ************
//        for(int j = 0 ; j <= 2*n+1; j++){
//           swap = mat[0][0];
//           System.out.println("j:"+j);
//
//            // left->right
//            for(int i = left+1 ; i <= right ; i++){
//                hold = mat[top][i];
//                mat[top][i] = swap;
//                swap  = hold;
//            }
////          top ->bottom
//            for(int i = top+1; i <= bottom;i++){
//                hold = mat[i][right];
//                mat[i][right] = swap;
//                swap  = hold;
//            }
////            // right->left
//            for(int i = right-1; i>= 0 ; i--){
//                hold = mat[bottom][i];
//                mat[bottom][i] = swap;
//                swap = hold;
//            }
////            // bottom->top
//            for(int i = bottom-1; i >=0 ;i--){
//                hold = mat[i][left];
//                mat[i][left] = swap;
//                swap = hold;
//            }
//
//            for (int[] elm : mat) {
//                System.out.println(Arrays.toString(elm));
//            }
//            System.out.println("--------------------");
//
//            if(j%2 != 0 && Arrays.deepEquals(target, mat ) && n >2){
//                System.out.println(true);
//                break;
//            }else if(Arrays.deepEquals(target, mat )){
//                System.out.println(true);
//                break;
//            }
//
//        }


//        again do
        int flag = 0;
        for(int i = 0 ; i < 4; i++){
            rotate90deg(mat);
            if(target == mat){
                flag++;
                break;
            }
        }

        System.out.println(flag > 0);



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
//        return mat;
    }

    static void rotate90deg(int[][] mat){
        transpose(mat);
        reverseMatRow(mat);
//        return mat;
    }
}
