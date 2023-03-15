package src.String_7;

public class Main  {
    //Выводим строку 3 разбив на подсроки
    public static void main(String[] args) {
        String word = "Работать нужно не 12 часов, а головой!".repeat(3);
        System.out.print("Строка до разбиения " + word);
        String[] words = word.split(" ");
        System.out.println("После разбиения: ");
        for (String subStr : words) {
            System.out.println(subStr);
        }
    }
}



