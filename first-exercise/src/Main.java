import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a,b;

        System.out.println("Digite o primeiro número: ");

        a = scanner.nextInt();

        System.out.println("Digite o segundo número: ");

        b = scanner.nextInt();

        System.out.println("Os números são: " + a + ", " + b);

        NumeroPrimo primo = new NumeroPrimo();

        List<Integer> numeros = primo.getPrimosEntre(a,b);

        numeros.forEach(number->System.out.println(number));
    }
}
