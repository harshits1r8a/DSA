package LinearSearch;

public class LinSer4min {
    public static void main(String[] args) {
        int[] arr = {12,34,5,6,7,8,90,32,54,76,98,9,-1};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int e : arr) {
            if (e < min){
                min = e;
            }
        }
        return min;
    }
}
