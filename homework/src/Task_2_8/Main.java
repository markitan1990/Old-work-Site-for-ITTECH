package Task_2_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String operand = scanner.next();
        int b = scanner.nextInt();
        print(a, operand, b );
    }

    static void print(int a,String operand, int b ) {
        switch (operand) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Not Supported operation : " + operand);
        }
    }
}
