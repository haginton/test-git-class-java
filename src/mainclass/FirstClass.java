package mainclass;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Second message");
    }

    public static double potencia(double base, double exponente){
        double potencia = 1;
        for (int i = 0; i < exponente; i++) {
            potencia += base;
        }

        return potencia;
    }
}
