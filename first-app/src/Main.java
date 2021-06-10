import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Retangulo r = new Retangulo(1,1,10,20);

        int area = r.calcularArea();

        System.out.println("A área é " + area);
        /* String nome = "Cristian";
        nome = nome.toUpperCase();

        System.out.println("Hello World " + nome);

        Scanner scan = new Scanner(System.in);

        nome = scan.next();

        System.out.println("Hello World " + nome);*/
    }
}
