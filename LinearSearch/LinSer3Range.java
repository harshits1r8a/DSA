package LinearSearch;

public class LinSer3Range {
    public static void main(String[] args) {
        int[] arr = {12,34,5,6,7,8,90,32,54,76,98,9};
        int target = 32;
        int start = 5;
        int end = 10;
        System.out.println(searInRange(arr,target,start,end));
    }

    static boolean searInRange(int[] arr , int target, int start, int end){
        if (arr.length == 0){
            return false;
        }

        for (int i = start ; i < end ; i++){
            if (target == arr[i]){
                System.out.println("index : "+i);
                return true;
            }
        }
        return false;}
}
