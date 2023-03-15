package src.String_2;

import java.util.HashMap;

public class Main {
    //Cчитаем количество слов в строке использую HashMap
    public static void main(String[] args) {
        String word="Упади семь раз и восемь раз поднимись";
        String[] words = word.split(" ");
        HashMap<Integer,String> someName=new HashMap<>();
        for (int i=0;i<words.length;i++){
            someName.put(i,words[i]);
        }
        System.out.println(someName.size());
    }
}
