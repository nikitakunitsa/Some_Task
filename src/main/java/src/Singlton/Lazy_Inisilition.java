package src.Singlton;

public class Lazy_Inisilition {
    private int number;
    private int number2;
    private int number3;

    public Lazy_Inisilition(int number, int number2) {
        this.number = number;
        this.number2 = number2;
    }

    public int getNumber(){
        if(number3==0){
          this.number3=number+number2;
        }
        return number3;
        }
    }

