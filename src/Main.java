//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Задача 1: Проверка на четность
        System.out.println("Задача 1. Введите число для проверки на четность:");
        int value = input.nextInt();
        System.out.println(value % 2 == 0 ? "Четное" : "Нечетное");

        // Задача 2: Поиск минимального числа среди трех
        System.out.println("Задача 2. Введите три числа:");
        int x = input.nextInt(), y = input.nextInt(), z = input.nextInt();
        int smallest = Math.min(x, Math.min(y, z));
        System.out.println("Минимальное число: " + smallest);

        // Задача 3: Таблица умножения на 5
        System.out.println("Задача 3. Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }

        // Задача 4: Сумма чисел от 1 до M
        System.out.println("Задача 4. Введите число M:");
        int M = input.nextInt(), totalSum = 0;
        for (int i = 1; i <= M; i++) {
            totalSum += i;
        }
        System.out.println("Сумма от 1 до " + M + ": " + totalSum);

        // Задача 5: Последовательность Фибоначчи
        System.out.println("Задача 5. Введите число N для Фибоначчи:");
        int N = input.nextInt();
        int[] fibonacciSeq = new int[N];
        fibonacciSeq[0] = 0;
        if (N > 1) fibonacciSeq[1] = 1;
        for (int i = 2; i < N; i++) {
            fibonacciSeq[i] = fibonacciSeq[i - 1] + fibonacciSeq[i - 2];
        }
        System.out.print("Числа Фибоначчи: ");
        for (int i : fibonacciSeq) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 6: Проверка простого числа
        System.out.println("Задача 6. Введите число для проверки:");
        value = input.nextInt();
        boolean prime = isPrime(value);
        System.out.println("Число " + value + (prime ? " простое" : " не простое"));

        // Задача 7: Вывод чисел от M до 1
        System.out.println("Задача 7. Введите число M:");
        M = input.nextInt();
        System.out.print("Числа от " + M + " до 1: ");
        for (int i = M; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 8: Сумма четных чисел между двумя числами
        System.out.println("Задача 8. Введите два числа A и B:");
        int first = input.nextInt(), second = input.nextInt(), evenSum = 0;
        for (int i = first; i <= second; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("Сумма четных чисел: " + evenSum);

        // Задача 9: Реверс строки
        System.out.println("Задача 9. Введите строку:");
        input.nextLine();  // Очистка буфера
        String text = input.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Реверс строки: " + reversed);

        // Задача 10: Подсчет цифр числа
        System.out.println("Задача 10. Введите число для подсчета цифр:");
        value = input.nextInt();
        int digitCount = Integer.toString(Math.abs(value)).length();
        System.out.println("Количество цифр: " + digitCount);

        // Задача 11: Вычисление факториала
        System.out.println("Задача 11. Введите число N:");
        N = input.nextInt();
        long fact = 1;
        for (int i = 2; i <= N; i++) {
            fact *= i;
        }
        System.out.println("Факториал числа " + N + " = " + fact);

        // Задача 12: Сумма цифр числа
        System.out.println("Задача 12. Введите число для нахождения суммы цифр:");
        value = input.nextInt();
        totalSum = 0;
        while (value != 0) {
            totalSum += Math.abs(value % 10);
            value /= 10;
        }
        System.out.println("Сумма цифр: " + totalSum);

        // Задача 13: Проверка строки на палиндром
        System.out.println("Задача 13. Введите строку:");
        text = input.nextLine().replaceAll("\\s+", "").toLowerCase();
        reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Строка " + (text.equals(reversed) ? "является палиндромом" : "не является палиндромом"));

        // Задача 14: Максимум в массиве
        System.out.println("Задача 14. Введите размер массива:");
        int arrSize = input.nextInt();
        int[] nums = new int[arrSize];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arrSize; i++) {
            nums[i] = input.nextInt();
        }
        int maxNum = nums[0];
        for (int num : nums) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        System.out.println("Максимальное число: " + maxNum);

        // Задача 15: Сумма элементов массива
        totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        System.out.println("Сумма всех элементов массива: " + totalSum);

        // Задача 16: Количество положительных и отрицательных чисел
        int positives = 0, negatives = 0;
        for (int num : nums) {
            if (num > 0) positives++;
            else if (num < 0) negatives++;
        }
        System.out.println("Положительных чисел: " + positives);
        System.out.println("Отрицательных чисел: " + negatives);

        // Задача 17: Простые числа в диапазоне
        System.out.println("Задача 17. Введите два числа A и B:");
        first = input.nextInt();
        second = input.nextInt();
        System.out.print("Простые числа: ");
        for (int i = first; i <= second; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Задача 18: Подсчет гласных и согласных
        System.out.println("Задача 18. Введите строку:");
        text = input.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : text.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) vowels++;
            else if (ch >= 'a' && ch <= 'z') consonants++;
        }
        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);

        // Задача 19: Перестановка слов
        System.out.println("Задача 19. Введите строку:");
        String[] wordsArray = input.nextLine().split("\\s+");
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            System.out.print(wordsArray[i] + " ");
        }
        System.out.println();

        // Задача 20: Число Армстронга
        System.out.println("Задача 20. Введите число:");
        value = input.nextInt();
        int original = value, numOfDigits = Integer.toString(Math.abs(value)).length(), armstrongSum = 0;
        while (value != 0) {
            armstrongSum += Math.pow(value % 10, numOfDigits);
            value /= 10;
        }
        System.out.println(original + (armstrongSum == original ? " является числом Армстронга" : " не является числом Армстронга"));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}