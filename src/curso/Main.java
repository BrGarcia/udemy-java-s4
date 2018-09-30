package curso;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Circulo c = new Circulo();
        c.raio = 5.6;
        System.out.println(c.circunferencia());
        System.out.println(c.area());
        sc.close();

    }
}
