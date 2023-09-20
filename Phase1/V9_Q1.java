package Phase1;

import java.util.Scanner;

public class V9_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if(b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println("Max no in a , b, c : "+max);
    }
}
