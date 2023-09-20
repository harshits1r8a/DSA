package Function;

public class V11Function4Shadowing {
    static int x = 29;//why it is static b/z you can not use object dependent thing inside independent thing.
    public static void main(String[] args) {
        System.out.println(x);
        int x = 32;
        System.out.println(x);
        fun();
        fun2(x);
    }

    static void fun(){
        System.out.println(x);
    }
    static void fun2(int num){
        System.out.println(num);
    }
}
