package src.Singlton;

public class Main {
    //Реализован паттерн синглон( ленивая инцилизация)
    public static void main(String[] args) {
     Lazy_Inisilition lazyInisilition=new Lazy_Inisilition(2,5);
     System.out.println(lazyInisilition.getNumber());
    }
}
