package src.Task_with_number;

import java.util.Scanner;

public class main {
    /*Есть метод который на вход принимает число с клавиатуры,
    если введеное число :
    1) четное, выводит, что число четное;
    2) если нечетное,  то выводит на экран,что число нечетное;
    3) если число делится на 10, выводит 1/10 числа
    4) если число делится на 3,то выводит на экран его факториал
    5) если выполняется несколько условий, то делаем счислом все условия
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int number1;
        int number2 = 1;
        if (number % 2 == 0) {
            System.out.println("Четное");
        }
        if (number % 2 == 1) {
            System.out.println("Нечетное");
        }
        if (number % 10 == 0) {
            number1 = number % 10;
            System.out.println(number1);
        }
        if (number % 3 == 0) {
            for (int i = 1; i <= number; i++) {
                number2 = number2 * i;
            }
            System.out.println(number2);
        }
    }
}

