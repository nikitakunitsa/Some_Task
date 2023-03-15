package src.Stream_Api;

import java.util.List;
import java.util.stream.Collectors;

public class Task2_2 {
    /*Есть метод который провереят, что если число четное, то умножает его на 100,
    если число, нечетное то отнимает от него 100. Используем этот метод к каждому числу нашей колекции
    с использоваем streamAPI;
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 15, 17, 18, 30, 35);
        Method method = new Method();
        System.out.println("Коллекция до изменений:" + list);
        List<Integer> newList = list.stream()
                .map(x -> method.streamMethod(x))
                .collect(Collectors.toList());
        System.out.println("Коллекция после изменений: " + newList);
    }
}
