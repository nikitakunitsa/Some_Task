package src.Massive;

public class Main {
    /*Cначала есть метод который заполняет массив нужными нами элментами и нужны количество,
    и также есть метод который переворачивает массив
     */
    public static void main(String[] args) {
        ArrayInverter arrayInverter = new ArrayInverter();
        ArrayInput arrayInput = new ArrayInput();
        arrayInverter.invert(arrayInput.inputArray());
    }
}
