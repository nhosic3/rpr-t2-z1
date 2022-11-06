package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int n = ulaz.nextInt();
        System.out.println("Sinus: " + sinus.sin(n));
        System.out.println("Faktorijel: " + faktorijel.f(n));
    }
}
