package Recursion;

public class RecByBackreacking {
    public static void main(String[] args) {
//        printLinNum(3,3);
        printRevNum(1,3);
    }

//    private static void printLinNum(int i, int n) {
//        if(i < 1) return;
//
//        printLinNum(i-1,n);
//        System.out.println(i);
//    }


    private static void printRevNum(int i, int n) {
        if(i >n) return;

        printRevNum(i+1,n);
        System.out.println(i);
    }
}
