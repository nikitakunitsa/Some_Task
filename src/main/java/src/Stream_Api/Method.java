package src.Stream_Api;

public class Method {
    public int streamMethod(int c){
        int d=0;
        if(c%2==0){
            d=c*100;
            return d;
        }
        else d=c-100;
        return d;
    }
}
