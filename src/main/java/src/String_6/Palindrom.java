package src.String_6;

public class Palindrom {
    //Проверяем слово на палиндром
    static boolean isPalindrome(String word) {
        String newWord;
        String newWord1;
        newWord=word.toLowerCase();
        newWord1= newWord.replaceAll(" ","");
        System.out.println(newWord);
        int length = newWord1.length();
        for (int i = 0; i < (length / 2); i++) {
            if (newWord1.charAt(i) != newWord1.charAt(length - i - 1)) {
                System.out.println(newWord1.charAt(i));
                System.out.println(newWord1.charAt(length - i - 1));
                return false;
            }
        }
        return true;
    }
}
