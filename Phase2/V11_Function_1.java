package Phase2;

public class V11_Function_1 {
    public static void main(String[] args) {
        System.out.println(sum(2,4));
        String greet = GreetMessage();
        System.out.println(greet);
    }

    private static String GreetMessage() {
        return "Hiii...";
    }

    public  static int sum(int a, int b){
        return a+b;
    }
}
