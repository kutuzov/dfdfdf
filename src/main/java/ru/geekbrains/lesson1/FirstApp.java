package ru.geekbrains.lesson1;


public class FirstApp {

    public static void comp (int c) {
        if (c >= 0) {
            System.out.println("с не отрицательно");
        }

        if (c < 0) {
            System.out.println("c отрицательно");
        }
    }

    public static void main(String[] args) {

        // объявляем и инициализируем три переменные
        int a = 2, b = 3, c = 0;

        if (a < b) {      // если a меньше b
            System.out.println("a меньше b");
        }
        if (a == b) {    // если a равно b
            System.out.println("a равно b. Это сообщение не будет выведено");
        }

        c = a - b; // переменная с = 2 - 3 = -1
        System.out.println("с = " + c);

        comp(c);

        c = b - a; // переменная с = 3 - 2 = 1
        System.out.println("с = " + c);

        comp(c);

    }

}

