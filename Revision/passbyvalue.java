package Revision;

import java.util.Arrays;

public class passbyvalue {
    public static void main(String[] args) {
        int[] str = new int[5];
        System.out.println(Arrays.toString(str));
        System.out.println(str[3]);
        String name = "Harshit";
        int[] num  = {1,2,3,4,5};

        String changeName = modifyName(name);
        System.out.println(name);
        System.out.println(changeName);


        System.out.println(Arrays.toString(num));
        int[] num2 = changeArr(num);
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num));
    }

    private static int[] changeArr(int[] num) {
        num[0] = 88;
        return num;
    }

    private static String modifyName(String name) {
        name = "Arpit";
        return name;
    }
}
