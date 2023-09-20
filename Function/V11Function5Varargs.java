package Function;


import java.util.Arrays;

public class V11Function5Varargs {
    public static void main(String[] args) {
        fun(1,34,2,56,75,87);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
