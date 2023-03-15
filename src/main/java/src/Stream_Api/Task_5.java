package src.Stream_Api;

import java.util.Arrays;
import java.util.List;
public class Task_5 {
    /*Вычисляем сумму четных чисел нашей колекции,
    c использованием cтримов
     */
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 2, 3, 15, 17, 18, 30, 35);
        Integer sum =  list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
