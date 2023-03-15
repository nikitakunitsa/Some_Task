package src.Stream_Api;

import java.util.List;
import java.util.stream.Collectors;

public class Task2_1 {
    //C использованием stream api переводим все отричательные числа в положительные
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, -3, 7);
        List<Integer> list1 = list.stream()
                .map(x -> Math.abs(x))
                .collect(Collectors.toList());
        System.out.println("Коллекция до перевода всех отрицательных чисел в положительные : " + list);
        System.out.println("Коллекция после изменений: " + list1);
    }
}

