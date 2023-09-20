package Phase1.Assingment_02;

import java.util.Scanner;


public class Ass_02_Q4 {
    public static void main(String[] args) {
//        4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("Enter two num.");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            System.out.println("Enter operator +,-,*,/,%");
            char op = sc.next().charAt(0);
            if (op == '+'){
                System.out.println(num1 +" + "+num2 +" = "+(num1+num2) );
            }if (op == '-'){
                System.out.println(num1 +" - "+num2 +" = "+(num1-num2) );
            }if (op == '*'){
                System.out.println(num1 +" * "+num2 +" = "+(num1*num2) );
            }if (op == '/'){
                System.out.println(num1 +" / "+num2 +" = "+(num1/num2) );
            }if (op == '%'){
                System.out.println(num1 +" % "+num2 +" = "+(num1%num2) );
            }if(op == 'x'){
                break;
            }
        }
    }
}
