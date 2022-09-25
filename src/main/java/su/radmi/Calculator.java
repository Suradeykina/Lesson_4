package su.radmi;

import java.util.Scanner;

public class Calculator {

    //positive wait
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operator;
        System.out.println("Привет! Я мини-калькулятор, помогу тебе решить несложные вычисления. Выбери, что ты будешь вычеслять (введи 1, 2, или 3 и нажми Enter): " +
                "1. Целые числа; " +
                "2. Дробные числа; " +
                "3. Строки.");
        String option = scanner.next();

        if (option.equals("1")) {
            System.out.print("Введи первое число и нажми Enter: ");
            int firstIntNumber = scanner.nextInt();

            System.out.print("Введи оператор и нажми Enter: ");
            operator = scanner.next();

            System.out.print("Введи второе число и нажми Enter: ");
            int secondIntNumber = scanner.nextInt();

            if (operator.equals("+")) {
                System.out.println("Результат: " + (firstIntNumber + secondIntNumber));
            } else if (operator.equals("-")) {
                System.out.println("Результат: " + (firstIntNumber - secondIntNumber));
            } else if (operator.equals("*")) {
                System.out.println("Результат: " + (firstIntNumber * secondIntNumber));
            } else if (operator.equals("/")) {
                System.out.println("Результат: " + (firstIntNumber / secondIntNumber));
            } else if (operator.equals("%")) {
                System.out.println("Результат: " + (firstIntNumber % secondIntNumber));
            } else System.out.println("Произошла ошибка: Ты ввел неверный оператор. Повтори снова.");

        } else if (option.equals("2")) {
            System.out.print("Введи первое число и нажми Enter: ");
            double firstDoubleNumber = scanner.nextDouble();

            System.out.print("Введи оператор и нажми Enter: ");
            operator = scanner.next();

            System.out.print("Введи второе число и нажми Enter: ");
            double secondDoubleNumber = scanner.nextDouble();

            if (operator.equals("+")) {
                System.out.println("Результат: " + (firstDoubleNumber + secondDoubleNumber));
            } else if (operator.equals("-")) {
                System.out.println("Результат: " + (firstDoubleNumber - secondDoubleNumber));
            } else if (operator.equals("*")) {
                System.out.println("Результат: " + (firstDoubleNumber * secondDoubleNumber));
            } else if (operator.equals("/")) {
                System.out.println("Результат: " + (firstDoubleNumber / secondDoubleNumber));
            } else if (operator.equals("%")) {
                System.out.println("Результат: " + (firstDoubleNumber % secondDoubleNumber));
            } else System.out.println("Произошла ошибка: Ты ввел неверный оператор. Повтори снова.");

        } else if (option.equals("3")) {
            System.out.println("Введи первое значение: ");
            String firstStringValue = scanner.next();

            System.out.println("Введи оператор: ");
            operator = scanner.next();

            System.out.println("Введи второе значение: ");
            String secondStringValue = scanner.next();

            if (operator.equals("+")) {
                System.out.println("Результат: " + (firstStringValue + " " + secondStringValue));
            } else System.out.println("Произошла ошибка: Ты ввел неверный оператор, ты можешь использовать только '+' (сложение). Повтори снова.");
        } else System.out.println("Произошла ошибка. Введён неверный вариант вычесления.");

    }

}
