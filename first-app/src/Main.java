import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int x = 10;

        String nome = "Cristian";
        nome = nome.toUpperCase();

        System.out.println("Hello World " + nome);

        Scanner scan = new Scanner(System.in);

        nome = scan.next();

        System.out.println("Hello World " + nome);
    }
}
