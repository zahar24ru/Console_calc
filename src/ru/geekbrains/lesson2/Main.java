package ru.geekbrains.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выбор операций \n 1. Сложение \n 2. Вычитание \n 3. Умножение \n 4. Деление \n 5. Остаток");
        Scanner scanner = new Scanner(System.in);
        int a,b,operation, result;
        String text = "WTF";
        operation = scanner.nextInt();
        System.out.println("Введите число А ");
        a = scanner.nextInt();
        System.out.println("Введите число B ");
        b = scanner.nextInt();
        result = 0;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else if (operation == 4) {
            result = a / b;
        } else if (operation == 5) {
            result = a % b;
        }else {

            System.out.println("Допущена ошибка в выборе действия" + operation);}
        System.out.println("Результат = " + result);

    }

}