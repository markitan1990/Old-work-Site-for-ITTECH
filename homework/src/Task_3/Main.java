package Task_3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sumAndMidSum();
        //exp();
        // expWithoutMath();
        //dayOfMonth();
        //task5();
        //task6();
        task7();
    }

    static void task7() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        for (int i = list.size(); i < 10; i++) {
            list.add(list.get(i - 1)+ list.get(i -2 ));
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    static void task6() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        int min = list.get(0);
        int max = list.get(0);
        for (Integer i : list) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("Среднее значение: " + (max + min) / 2);

    }

    static void task5() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void dayOfMonth() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.next();
            if ("end".equals(str)) {
                break;
            }

            int n = 0;
            switch (str) {
                case "Январь":
                    n = 31;
                    break;
                case "Февраль":
                    n = 28;
                    break;
                case "Март":
                    n = 31;
                    break;
                case "Апрель":
                    n = 30;
                    break;
                case "Май":
                    n = 31;
                    break;
                case "Июнь":
                    n = 30;
                    break;
                case "Июль":
                    n = 31;
                    break;
                case "Август":
                    n = 31;
                    break;
                case "Сентябрь":
                    n = 30;
                    break;
                case "Октябрь":
                    n = 31;
                    break;
                case "Ноябрь":
                    n = 30;
                    break;
                case "Декабрь":
                    n = 31;
                    break;
                default:
                    System.out.println("Не правильно введень месяц");
                    break;
            }
            System.out.println(n);
        }
    }

    static void expWithoutMath() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(),
                exponent = scanner.nextInt(),
                x = number;
        for (int i = 1; i < exponent; i++) {
            number *= x;
        }
        System.out.println(number);
    }

    static void exp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println((int) (Math.pow(Math.abs(scanner.nextInt()), Math.abs(scanner.nextInt()))));
    }

    static void sumAndMidSum() {
        Scanner scanner = new Scanner(System.in);
        int i = 0,
                count = 0;
        while (true) {

            int x = scanner.nextInt();
            if (x == -1) break;
            count++;
            i += x;
        }
        System.out.printf("%d\n%d", i, i / count);
    }
}
