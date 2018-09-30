package curso;

public class Circulo {

    public static final double PI = 3.14;
    public double raio;

    public double circunferencia(){
        return 2*PI*this.raio;
    }
    public double area(){
        return PI*raio*raio;
    }
}

