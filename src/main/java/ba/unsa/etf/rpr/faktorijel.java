package ba.unsa.etf.rpr;

public class faktorijel {
    public static int f(int x){
        int p=1;
        for(int i=1; i<=x; i++)
            p*=i;
        return p;
    }
}
