package Function;

public class V11Function {
    public static void main(String[] args){
        System.out.println("Sum of 5 and 6 : "+sum(5,6));
        System.out.println("Sum of 5 and 6 : "+sum(5.1f,3.1f));
        System.out.println(greet("Aastha"));

//        ********************************
        String name = "harshit";
        changeName(name);
        System.out.println(name);
    }

    static float sum(float a, float b){
        return (a+b);
    }

    static String greet(String name){
        return "Hii, "+name+" !";
    }

//    ****
    static void changeName(String n){
        n = "Arpit Sharma";
    }
}
