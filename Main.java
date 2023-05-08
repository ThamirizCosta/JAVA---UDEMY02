import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int x,y,z;
        x = 5;
        y = 10;
        z = 3 * x + 2 - y;


        System.out.println(x);
        System.out.println(y);
        System.out.println("Sabendo que o valor de Z é o resultado da equação : 3 * x + 2 - y  é o valor de Z, então Z vale:  " + z);

    }
}