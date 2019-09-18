package NewTask_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //newTask2();
//        newTask3();
//        newTask4();
//        newTask5();
    }

    static  void newTask5(){
        Scanner scanner = new Scanner(System.in);
        int step = scanner.nextInt();
        System.out.printf("Input number of terms : %d\n", step);
        for (int i = 1; i <= step; i++) {
            System.out.printf("Number is : %d and cube of %d is : %d\n", i, i, (int)(Math.pow(i,3)));
        }
    }

    static void newTask4(){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Input first number: " + num1);
        System.out.println("Input second number: " + num2);
        System.out.println("Input third number: " + num3);
        if(num1 == num2 && num1 == num3){
            System.out.println("All numbers are equal");
        }else{
            if (num1 == num2 || num1 == num3 || num2 == num3){
                System.out.println("Neither all are equal or different");
            }else {
                System.out.println("All numbers are different");
            }
        }
    }
    static void newTask3(){
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }


    static void newTask2() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 0, step = count; step > 0; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                step--;
                sum += i;
            }
        }
        System.out.printf("The Sum of odd Natural Number upto %d terms is: %d",  count, sum);
    }
}
