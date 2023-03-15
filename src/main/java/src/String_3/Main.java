package src.String_3;

public class Main {
    //Меняем символы * на a  в строке и выводим новую полученную строку
    public static void main(String[] args) {
        String word="Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.";
        String ch="*";
        String newWord="";
        String newChar="a";
        for (int i=0;i<word.length();i++){
            ch.equals(word.charAt(i));
            newWord=word.replace(ch,newChar);
        }
        System.out.println(newWord);
    }
}
