package ba.unsa.etf.rpr;

public class sinus {
    public static double sin(double x){
        x*=Math.PI/180;
        double s=0;
        for(int i=0; i<10; i++)
            s+=Math.pow(-1,i)*Math.pow(x,2*i+1)/faktorijel.f(2*i+1);
        return s;
    }
}
