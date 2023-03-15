package src.String_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // Меняем расположение слов в строке задом напередет 2 вариантами
    public static void main(String[] args) {
        String word = "Никогда не ошибается тот, кто ничего не делает";
        String word1 = "Никогда не ошибается тот, кто ничего не делает";
        List<Character> list = new ArrayList<>();
        for (char c : word.toCharArray()) {
            list.add(c);
        }
        Collections.reverse(list);
        StringBuilder builder = new StringBuilder(list.size());
        for (Character c : list) {
            builder.append(c);
        }
        System.out.println(builder.toString());
        char[] c = word1.toCharArray();
        String delimetr="";
        for(int i=c.length-1;i>=0;i--){
                delimetr+=c[i];
            }
        System.out.println(delimetr);
    }
}


