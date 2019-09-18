package Task_2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sum(scanner.nextInt(), scanner.nextInt());
    }

    static void sum(int a, int b) {
        if (a + b == 0){
            System.out.println("Zero " + (a + b));
        }else {
            System.out.println("Positive " + (a + b));
        }
    }
}
