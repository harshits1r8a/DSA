package Phase1;



import java.util.Scanner;

public class V9_Q4NumOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        int key = sc.nextInt();
        System.out.println("Occurence of " + key + " : " + NumOcc(num,key));
    }

    static int NumOcc(long n, int key){
        int cnt = 0;
        while(n>0){
            long rem = n % 10;
             n = n / 10;
            if(rem == key){
                cnt++;
            }
        }
        return cnt;
    }

//    1st brutforce
//    static int NumOcc(long n,int key){
//        String str = String.valueOf(n);
//        int cnt = 0;
//        for (int i = 0; i < str.length(); i++){
//            if(str.charAt(i) - '0' == key){
//                cnt++;
//            }
//        }
//        return cnt;
//    }
}
