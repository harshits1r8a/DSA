package Array;

public class Array7Maxelem {
    public static void main(String[] args) {
        int[] arr = {};
        int maxElem = maxElemArr(arr);
        System.out.println(maxElem);

        int maxElmR = maxElmRange(arr , 2,5);
        System.out.println(maxElmR);
    }

    static int maxElemArr(int[] arr){
        int max = 0;
        if( arr.length == 0){
            return -1;
        }
        for (int e : arr) {
            if(e > max ){
                max = e;
            }
        }
        return max;
    }

    static  int maxElmRange(int[] arr , int start, int end){
        int max = 0;
        if( end > start){
            return -1;
        }
        if( arr == null){
            return -1;
        }
        for (int i = start ; i < end; i++) {
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }
}
