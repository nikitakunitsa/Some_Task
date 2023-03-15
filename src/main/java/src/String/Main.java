package src.String;

public class Main {
    /* Есть 3 метода, который могут разделить строку по какому-то делителю,
    по словам и по буквам */
    public static void main(String[] args) {
        Splitting splitting = new Splitting();
        splitting.splitDelimeter();
        splitting.splitWords();
        splitting.splitLetters();
    }
}
