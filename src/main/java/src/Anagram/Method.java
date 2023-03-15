package src.Anagram;

import java.util.Arrays;

public class Method {
    public String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public boolean permutation (String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            System.out.println("Строки разной длинны");
            return false;
        }
        return sort(firstWord).equals(sort(secondWord));
    }
}
