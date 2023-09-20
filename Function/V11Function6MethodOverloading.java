package Function;

public class V11Function6MethodOverloading {
    public static void main(String[] args) {
        fun("Harshit");
        fun(12,34,56);
        fun(9999);
    }

    static void fun(int num){
        System.out.println(num);
    }
    static void fun(int num1,int num2,int num3){
        System.out.println(num1+","+num2+","+num3);
    }
    static void fun(String str){
        System.out.println(str);
    }
}
