package src.Stream_Api;

import java.util.List;
import java.util.stream.Collectors;
public class Task2_3 {
    /*Есть колекция Имен, с использованием стримов перебираем,
    получая новую коллекцию, где имена начинаются на A
     */
    public static void main(String[] args) {
        List<String> list = List.of("Aндрей", "Никита", "Aндрей", "Влад", "Никита", "Aндрей", "Влад");
        List<String> list1 = list.stream()
                .filter(el -> el.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Коллекция до фильтрации: " + list);
        System.out.println("Коллекция после фильтрации: " + list1);
    }
}
