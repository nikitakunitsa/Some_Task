package src.String_4;

public class Main {
    //Удаляем ! из строки
    public static void main(String[] args) {
        String word="Работать нужно не 12 часов, а головой!";
        StringBuffer newWord=new StringBuffer(word);
        System.out.println(newWord.deleteCharAt(word.indexOf("!")));
    }
}
