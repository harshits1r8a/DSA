package LinearSearch;

public class LinSer1 {
    public static void main(String[] args) {
        int[] arr = {12,34,67,87,99};
        int key = 60;
        System.out.println(LinSearch(arr,key));
        System.out.println(LinSearch2(arr,key));
    }

    static boolean LinSearch(int[] arr, int key){
        if (arr.length == 0){
            return  false;
        }
        for (int e : arr ) {
            if ( key == e ){
                return true;
            }
        }
        return false;
    }

    static int LinSearch2(int[] arr, int key){
        if (arr.length == 0){
            return  -1;
        }
        for (int e : arr ) {
            if ( key == e ){
                return 1;
            }
        }
        return -1;
    }
}
