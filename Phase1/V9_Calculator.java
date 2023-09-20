package Phase1;

import java.util.Scanner;

public class V9_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Enter operator :");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter two nu. :");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+'){
                    System.out.println( num1 + num2);
                }if (op == '-'){
                    System.out.println( num1 - num2);
                }if (op == '*'){
                    System.out.println( num1 * num2);
                }if (op == '%'){
                    System.out.println( num1 % num2);
                }if (op == '/'){
                    System.out.println( num1 / num2);
                }
            } else if (op == 'x') {
                break;
            }else {
                System.out.println("Invalid op.");
            }
        }
    }
}
