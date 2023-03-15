package src.Factorial;

import java.util.Scanner;
public class Main {
    /*Вычисление факторила с использованием рекурсии и без
    Есть 2 метода которые на вход принимают значения, и вычисляют факториал
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recursive recursive = new Recursive();
        System.out.println(recursive.factorialNoRecursive());
        System.out.println(recursive.factorialRecursive(scanner.nextInt()));
    }
}