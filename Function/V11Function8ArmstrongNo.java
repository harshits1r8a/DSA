package Function;

import java.util.Scanner;

public class V11Function8ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = in.nextInt();
        System.out.println(isArmstrong(num));

        for (int i = 100 ; i < 1000 ; i++){
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isArmstrong(int num) {
        int n = num;
        int arm = 0;
        int length = Integer.toString(num).length();
        while(n > 0){
            int rem = n%10;
            arm+=Math.pow(rem,length);
            n /= 10;
        }
        return num == arm ? true:false;
    }

}
